
package com.dealership.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import org.springframework.beans.factory.annotation.Qualifier;

import com.dealership.engine.PetrolEngine;
import com.dealership.engine.DieselEngine;
import com.dealership.engine.ElectricEngine;
import com.dealership.engine.CNGEngine;

import com.dealership.model.Car;
import com.dealership.model.Engine;

@Configuration
public class AppConfig {

    // Petrol Engine
    @Bean
    @Primary
    public PetrolEngine petrolEngine() {
        return new PetrolEngine();
    }

    // Diesel Engine
    @Bean
    public DieselEngine dieselEngine() {
        return new DieselEngine();
    }

    // Electric Engine
    @Bean
    public ElectricEngine electricEngine() {
        return new ElectricEngine();
    }

    // CNG Engine
    @Bean
    public CNGEngine cngEngine() {
        return new CNGEngine();
    }

    // Car bean
    @Bean
    public Car car(@Qualifier("electricEngine") Engine engine) {
        return new Car(engine);
    }

}
