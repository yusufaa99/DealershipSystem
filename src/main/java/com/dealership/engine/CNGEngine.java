
package com.dealership.engine;

import com.dealership.model.Engine;

public class CNGEngine implements Engine {

    @Override
    public void start() {
        System.out.println("CNG engine started successfully!");
    }

}
