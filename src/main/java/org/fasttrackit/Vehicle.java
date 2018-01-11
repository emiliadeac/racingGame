package org.fasttrackit;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Vehicle {
    private String name;
    private String color;
    private double currentSpeed;
    private double travelDistance;
    private double mileage;
    private double fuelLevel;


    public void accelerate(double speed) {
        //return super.accelerate(speed); super cheama de la clasa parinte
        // setCurrentSpeed(getCurrentSpeed()+ speed);
       // System.out.println("Accelerate implemnetation from Autovehicle");
        double finalSpeed = getCurrentSpeed() + speed;
        setCurrentSpeed(finalSpeed);
        double travelDistance = finalSpeed / 60;
        double spentFuel = travelDistance * mileage / 100;
        fuelLevel -= spentFuel;
        //same as fuelLevel = fuelLevel - spentFuel;
        travelDistance += currentSpeed / 60;


    }


    public double accelerate(double speed, double time) {//overloading method
        return 20;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double getTravelDistance() {
        return travelDistance;
    }

    public void setTravelDistance(double travelDistance) {
        this.travelDistance = travelDistance;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @Override//method overriding
    public String toString() { //alt+insert-toString
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

