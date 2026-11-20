package com.dealership.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(
    basePackages = "com.dealership.controller",
    includeFilters = @Filter(
        type = FilterType.ANNOTATION,
        classes = RestController.class
    )
)
public class WebConfig {

}
