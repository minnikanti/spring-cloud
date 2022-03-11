package com.mypack.resource.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudOauth2ResourceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudOauth2ResourceServerApplication.class, args);
    }

}
