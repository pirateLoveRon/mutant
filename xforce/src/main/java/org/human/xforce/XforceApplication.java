package org.human.xforce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class XforceApplication {

    public static void main(String[] args) {
        SpringApplication.run(XforceApplication.class, args);
    }

}
