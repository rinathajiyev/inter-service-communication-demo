package com.ecommerce.webclient;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WenClientConfig {
//    @Bean
//    @LoadBalanced
//    public WebClient.Builder getWebClientBuilder() {
//        return WebClient.builder();
//    }

    @Bean
    public WebClient getWebClientInstance(WebClient.Builder builder) {
        return builder.baseUrl("http://PRODUCER").build();
    }
}
