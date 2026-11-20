
package com.dealership.model;

import java.math.BigDecimal;

public class Vehicle {

    private Long id;
    private String make;
    private String model;
    private Integer year;
    private BigDecimal price;
    private String color;
    private String fuelType;
    private String transmission;
    private Integer mileage;

    // Default constructor
    public Vehicle() {
    }

    // Constructor
    public Vehicle(Long id, String make, String model,
                   Integer year, BigDecimal price,
                   String color, String fuelType,
                   String transmission, Integer mileage) {

        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.mileage = mileage;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }
}
