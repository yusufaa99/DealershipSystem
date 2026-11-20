
package com.dealership.engine;

import com.dealership.model.Engine;

public class DieselEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Diesel engine started successfully!");
    }

}
