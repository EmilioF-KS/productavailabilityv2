package com.productcache.webservice.productavailability;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.productcache.webservice.productavailability"})
public class ProductavailabilityApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductavailabilityApplication.class, args);
    }
}
