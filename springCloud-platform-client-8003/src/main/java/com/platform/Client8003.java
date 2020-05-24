package com.platform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("com.platform.dao")
@EnableEurekaClient
@SpringBootApplication
public class Client8003 {

    public static void main(String[] args) {
        SpringApplication.run(Client8003.class, args);
    }

}
