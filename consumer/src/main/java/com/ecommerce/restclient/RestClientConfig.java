package com.ecommerce.restclient;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {

//    @Bean
//    @LoadBalanced
//    public RestClient.Builder getRestClientBuilder() {
//        return RestClient.builder();
//    }

    @Bean
    public RestClient getRestClientInstance(RestClient.Builder builder) {
        return builder.baseUrl("http://producer").build();
    }
}
