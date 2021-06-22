package com.ys.kc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"/dubbo-consumer.xml"})
public class PmsControllerApplication {
    public static void main(String[] args) {
        SpringApplication.run(PmsControllerApplication.class,args);
    }
}
