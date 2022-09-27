package com.dft.api;

import com.dft.model.getsolditems.request.Request;
import com.dft.model.getsolditems.response.GetSoldItemsResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.io.IOException;

@Log4j2
@SpringBootTest(classes = AfterBuySDK.class)
@RunWith(SpringRunner.class)
class AfterBuySdkTest {

    XmlMapper xmlMapper = XmlMapper.xmlBuilder()
        .configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true).build();

    AfterBuySDK afterBuySDK = new AfterBuySDK();

    @Test
    @Disabled
    public void getSoldItems() throws IOException {
        Request request = xmlMapper.readValue(getClass().getClassLoader().getResource("test_request.xml"), new TypeReference<>() {
        });
        log.debug("xml: {}", request);
        Mono<GetSoldItemsResponse> response = afterBuySDK.getSoldItems(request);
        StepVerifier.create(response)
            .consumeNextWith(afterbuy ->
                log.debug("response size: {}", afterbuy.getResult().getOrders().getOrderList().size())
            ).verifyComplete();
    }
}
