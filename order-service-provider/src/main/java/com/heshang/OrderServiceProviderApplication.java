package com.heshang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class OrderServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceProviderApplication.class, args);
    }

}
