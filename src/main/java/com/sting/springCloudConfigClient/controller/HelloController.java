package com.sting.springCloudConfigClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {

    @Value("${info.profile:dev}")
    private String profile;

    @GetMapping("/info")
    public Mono<String> hello(){
        return Mono.justOrEmpty(profile);
    }
}
