package com.ecommerce.restclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {

    @Bean
    public RestClient getRestClientInstance(RestClient.Builder builder) {
        return builder.baseUrl("http://localhost:8081").build();
    }
}
