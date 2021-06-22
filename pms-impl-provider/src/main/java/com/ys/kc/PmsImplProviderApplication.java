package com.ys.kc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo-provider.xml"})
public class PmsImplProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(PmsImplProviderApplication.class,args);
    }
}
