
package com.dealership.engine;

import com.dealership.model.Engine;

public class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Electric engine started successfully!");
    }

}
