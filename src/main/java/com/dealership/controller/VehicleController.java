
package com.dealership.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dealership.model.Vehicle;
import com.dealership.service.VehicleService;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    private final VehicleService vehicleService;

    // Constructor injection
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    // Register a new vehicle
    @PostMapping
    public ResponseEntity<Vehicle> createVehicle(
            @RequestBody Vehicle vehicle) {

        Vehicle savedVehicle = vehicleService.createVehicle(vehicle);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedVehicle);
    }

    // Retrieve all vehicles
    @GetMapping
    public ResponseEntity<List<Vehicle>> getAllVehicles() {

        List<Vehicle> vehicles = vehicleService.getAllVehicles();

        return ResponseEntity.ok(vehicles);
    }

    // Retrieve one vehicle by ID
    @GetMapping("/{id}")
    public ResponseEntity<Vehicle> getVehicleById(
            @PathVariable("id") Long id) {

        Vehicle vehicle = vehicleService.getVehicleById(id);

        if (vehicle == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(vehicle);
    }

    // Update an existing vehicle
    @PutMapping("/{id}")
    public ResponseEntity<Vehicle> updateVehicle(
            @PathVariable("id") Long id,
            @RequestBody Vehicle vehicle) {

        Vehicle updatedVehicle =
                vehicleService.updateVehicle(id, vehicle);

        if (updatedVehicle == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(updatedVehicle);
    }

    // Delete a vehicle
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVehicle(
            @PathVariable("id") Long id) {

        boolean deleted = vehicleService.deleteVehicle(id);

        if (!deleted) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.noContent().build();
    }
}
