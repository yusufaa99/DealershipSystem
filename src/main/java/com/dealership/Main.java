
package com.dealership;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dealership.config.AppConfig;
import com.dealership.model.Car;
import com.dealership.model.Engine;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("================================");
        System.out.println("   DEALERSHIP MANAGEMENT SYSTEM");
        System.out.println("================================");

        // Test Car bean - @Primary selects PetrolEngine
        System.out.println("\n--- Starting Car ---");

        Car car = context.getBean(Car.class);
        car.startCar();

        // Test individual engine beans
        System.out.println("\n--- Testing All Engines ---");

        Engine petrol =
                context.getBean("petrolEngine", Engine.class);
        petrol.start();

        Engine diesel =
                context.getBean("dieselEngine", Engine.class);
        diesel.start();

        Engine electric =
                context.getBean("electricEngine", Engine.class);
        electric.start();

        Engine cng =
                context.getBean("cngEngine", Engine.class);
        cng.start();

        context.close();
    }
}
