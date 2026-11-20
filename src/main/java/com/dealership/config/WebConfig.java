
package com.dealership.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {
    "com.dealership.controller",
    "com.dealership.service",
    "com.dealership.repository"
})
public class WebConfig {

}
