package com.aprisma.microservices.helloapp.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.aprisma.microservices.helloapp")
public class FeignConfiguration {

}
