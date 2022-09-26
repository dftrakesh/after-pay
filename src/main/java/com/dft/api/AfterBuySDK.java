package com.dft.api;

import com.dft.api.exception.BadRequestException;
import com.dft.api.exception.NotFoundException;
import com.dft.api.exception.TooManyRequestsException;
import com.dft.api.exception.UnauthorizedException;
import com.dft.model.getsolditems.request.Request;
import com.dft.model.getsolditems.response.GetSoldItemsResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Log4j2
public class AfterBuySDK {
    WebClient webClient = WebClient.builder()
        .exchangeStrategies(ExchangeStrategies.builder()
            .codecs(configurer -> configurer
                .defaultCodecs()
                .maxInMemorySize(16 * 1024 * 1024))
            .build()).build();

    XmlMapper xmlMapper = XmlMapper.xmlBuilder().build();

    public Mono<GetSoldItemsResponse> getSoldItems(Request request) throws JsonProcessingException {

        return webClient.method(HttpMethod.GET)
            .uri("https://api.afterbuy.de/afterbuy/ABInterface.aspx")
            .header("Content-Type", "text/xml; charset=utf-8")
            .bodyValue(writeValueAsString(request))
            .exchangeToMono(clientResponse -> handleResponse(clientResponse, GetSoldItemsResponse.class));
    }

    private <T> String writeValueAsString(T requestClazz) {
        try {
            return xmlMapper.writeValueAsString(requestClazz);
        } catch (JsonProcessingException exception) {
            log.error("Error while creating xml string", exception);
            return "";
        }
    }

    private <T> Mono<T> readValue(String xml, Class<T> clazz) {
        try {
            T classToReturn = xmlMapper.readValue(xml, clazz);
            return Mono.just(classToReturn);
        } catch (JsonProcessingException exception) {
            log.error("Error occurred while converting reading xml string", exception);
            return Mono.empty();
        }
    }

    private <T> Mono<T> handleResponse(ClientResponse clientResponse, Class<T> clazz) {
        if (clientResponse.statusCode().is2xxSuccessful()) {
            return clientResponse.bodyToMono(String.class)
                .flatMap(responseString -> readValue(responseString, clazz));
        }
        return handleUnknownError(clientResponse);
    }

    private <T> Mono<T> handleUnknownError(ClientResponse clientResponse) {
        log.debug("Handle unknown error {}", clientResponse.statusCode().getReasonPhrase());

        return clientResponse
            .bodyToMono(String.class)
            .flatMap(responseBody -> {
                log.debug("Response status code {} body {}", clientResponse.rawStatusCode(), responseBody);

                if (clientResponse.statusCode().equals(HttpStatus.NOT_FOUND)) {
                    return Mono.error(new NotFoundException());
                }
                if (clientResponse.statusCode().equals(HttpStatus.UNAUTHORIZED)) {
                    return Mono.error(new UnauthorizedException());
                }
                if (clientResponse.statusCode().equals(HttpStatus.TOO_MANY_REQUESTS)) {
                    return Mono.error(new TooManyRequestsException());
                }
                if (clientResponse.statusCode().equals(HttpStatus.BAD_REQUEST)) {
                    return Mono.error(new BadRequestException());
                }
                return Mono.error(new IllegalStateException(responseBody));
            });
    }

}