package com.ecommerce.httpinterface;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange(url = "http://localhost:8081")
public interface ProviderHttpInterface {

    @GetExchange("/instance-info")
    String getInstanceInfo();
}
