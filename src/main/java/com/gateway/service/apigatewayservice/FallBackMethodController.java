package com.gateway.service.apigatewayservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("accountServiceFallback")
    public String accountServiceFallback(){
        return "Account-Service is taking long than Expected."
                + "please try again after some time.";
    }

    @GetMapping("productServiceFallback")
    public String productServiceFallback(){
        return "Product-Service is taking long than Expected."
                + "please try again after some time.";
    }

}
