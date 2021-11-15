package com.heshang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class OrderServiceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceConsumerApplication.class, args);
    }

}
