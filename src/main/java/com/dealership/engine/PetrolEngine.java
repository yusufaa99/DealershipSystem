
package com.dealership.engine;

import com.dealership.model.Engine;

public class PetrolEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Petrol engine started successfully!");
    }

}
