package com.ecommerce.httpinterface;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/http-interface")
@RequiredArgsConstructor
public class HttpInterfaceController {

    private final HttpInterfaceConfig httpInterfaceConfig;

    @GetMapping("/instance")
    public String getInstance() {
        ProviderHttpInterface providerHttpInterface = httpInterfaceConfig.getClientHttpInterface();
        return providerHttpInterface.getInstanceInfo();
    }
}
