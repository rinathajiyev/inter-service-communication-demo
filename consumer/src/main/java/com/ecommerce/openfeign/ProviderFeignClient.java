package com.ecommerce.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "producer")
public interface ProviderFeignClient {

    @GetMapping("/instance-info")
    String getInstanceInfo();
}
