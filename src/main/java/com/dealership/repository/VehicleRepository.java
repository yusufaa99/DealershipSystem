
package com.dealership.repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Repository;

import com.dealership.model.Vehicle;

@Repository
public class VehicleRepository {

    private final Map<Long, Vehicle> vehicles = new LinkedHashMap<>();

    private final AtomicLong idGenerator = new AtomicLong(1);

    // Save a new vehicle
    public Vehicle save(Vehicle vehicle) {

        Long id = idGenerator.getAndIncrement();

        vehicle.setId(id);

        vehicles.put(id, vehicle);

        return vehicle;
    }

    // Retrieve all vehicles
    public List<Vehicle> findAll() {

        return new ArrayList<>(vehicles.values());
    }

    // Retrieve one vehicle by ID
    public Vehicle findById(Long id) {

        return vehicles.get(id);
    }

    // Update an existing vehicle
    public Vehicle update(Long id, Vehicle vehicle) {

        if (!vehicles.containsKey(id)) {
            return null;
        }

        vehicle.setId(id);

        vehicles.put(id, vehicle);

        return vehicle;
    }

    // Delete a vehicle
    public boolean delete(Long id) {

        return vehicles.remove(id) != null;
    }
}
