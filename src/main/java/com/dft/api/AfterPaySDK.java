package com.dft.api;

import com.dft.model.getsolditems.request.Request;
import com.dft.model.getsolditems.response.Afterbuy;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpMethod;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Log4j2
public class AfterPaySDK {
    WebClient webClient = WebClient.builder()
        .exchangeStrategies(ExchangeStrategies.builder()
            .codecs(configurer -> configurer
                .defaultCodecs()
                .maxInMemorySize(16 * 1024 * 1024))
            .build()).build();

    XmlMapper xmlMapper = XmlMapper.xmlBuilder().build();

    public Mono<Afterbuy> getSoldItems(Request request) throws JsonProcessingException {

        return webClient.method(HttpMethod.GET)
            .uri("https://api.afterbuy.de/afterbuy/ABInterface.aspx")
            .header("Content-Type", "application/xml")
            .bodyValue(writeValueAsString(request))
            .exchangeToMono(clientResponse -> clientResponse.bodyToMono(String.class))
            .flatMap(responseString -> readValue(responseString, Afterbuy.class));
    }

    private<T> String writeValueAsString(T requestClazz) {
        try {
            return xmlMapper.writeValueAsString(requestClazz);
        } catch (JsonProcessingException exception) {
            log.error("Error while converting to xml.", exception);
            return "";
        }
    }

    private <T> Mono<T> readValue(String xml, Class<T> clazz) {
        try {
            T classToReturn = xmlMapper.readValue(xml, clazz);
            log.debug("classToReturn: {}", classToReturn);
            return Mono.just(classToReturn);
        } catch (JsonProcessingException exception) {
            log.error("Error occurred while converting reading xml string", exception);
            return Mono.empty();
        }
    }

}