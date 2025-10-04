package com.ecommerce.webclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WenClientConfig {

    @Bean
    public WebClient getWebClientInstance(WebClient.Builder builder) {
        return builder.baseUrl("http://localhost:8081").build();
    }
}
