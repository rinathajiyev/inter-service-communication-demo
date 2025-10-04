package com.ecommerce.webclient;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/web-client")
@RequiredArgsConstructor
public class WebClientController {
    private final WebClientService webClientService;

    @GetMapping("/instance")
    public Mono<String> getInstance() {
//        WebClient webClient = WebClient.create("http://localhost:8081");
//        return webClient.get()
//                .uri("/instance-info")
//                .retrieve()
//                .bodyToMono(String.class);

        return webClientService.getInstance();
    }
}
