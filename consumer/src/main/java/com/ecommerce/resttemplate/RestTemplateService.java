package com.ecommerce.resttemplate;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class RestTemplateService {

    private final RestTemplate restTemplate;
    private static final String INSTANCE_URL = "http://PRODUCER";

    public String getInstance(){
        return restTemplate.getForObject(INSTANCE_URL + "/instance-info", String.class);
    }
}
