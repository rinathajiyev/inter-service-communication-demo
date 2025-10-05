package com.ecommerce.httpinterface;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.client.support.RestTemplateAdapter;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;
import org.springframework.web.util.DefaultUriBuilderFactory;

@Configuration
public class HttpInterfaceConfig {

    @Bean
    @LoadBalanced
    public WebClient.Builder getWebClientBuilder() {
        return WebClient.builder();
    }

    @Bean
    public ProviderHttpInterface getClientHttpInterface (WebClient.Builder builder) {
        WebClient webClient = builder.baseUrl("http://producer").build();
        WebClientAdapter adapter = WebClientAdapter.create(webClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();

        return factory.createClient(ProviderHttpInterface.class);
    }

//    @Bean
//    @LoadBalanced
//    public RestClient.Builder getRestClientBuilder() {
//        return RestClient.builder();
//    }
//
//    @Bean
//    public ProviderHttpInterface getClientHttpInterface (RestClient.Builder builder){
//        RestClient restClient = builder.baseUrl("http://producer").build();
//        RestClientAdapter adapter = RestClientAdapter.create(restClient);
//        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
//
//        return factory.createClient(ProviderHttpInterface.class);
//    }

//    @Bean
//    @LoadBalanced
//    public RestTemplate getRestTemplate() {
//        return new RestTemplate();
//    }

//    @Bean
//    public ProviderHttpInterface getClientHttpInterface(RestTemplate restTemplate) {
////        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.setUriTemplateHandler(new DefaultUriBuilderFactory("http://producer"));
//        RestTemplateAdapter adapter = RestTemplateAdapter.create(restTemplate);
//        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
//
//        return factory.createClient(ProviderHttpInterface.class);
//    }
}
