
package com.dealership.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dealership.model.Vehicle;
import com.dealership.repository.VehicleRepository;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    // Constructor injection
    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    // Register a vehicle
    public Vehicle createVehicle(Vehicle vehicle) {

        return vehicleRepository.save(vehicle);
    }

    // Get all vehicles
    public List<Vehicle> getAllVehicles() {

        return vehicleRepository.findAll();
    }

    // Get one vehicle
    public Vehicle getVehicleById(Long id) {

        return vehicleRepository.findById(id);
    }

    // Update a vehicle
    public Vehicle updateVehicle(Long id, Vehicle vehicle) {

        return vehicleRepository.update(id, vehicle);
    }

    // Delete a vehicle
    public boolean deleteVehicle(Long id) {

        return vehicleRepository.delete(id);
    }
}
