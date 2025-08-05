package com.productcache.webservice.productavailability;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ProductavailabilityController {
	private final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Value("Productavailability New Service")
    private String greetingMessage;
	
    @GetMapping("/index")
    public String hello() {
    	LOGGER.debug("This is a debug message");
    	LOGGER.info("This is an info message");
    	LOGGER.warn("This is a warn message");
    	LOGGER.error("This is an error message");
    	
        return greetingMessage;
    }
}
