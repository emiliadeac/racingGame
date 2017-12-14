package org.fasttrackit;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Vehicle {
    private String name;
    private String color;
    private double currentSpeed;

    public double accelerate(double speed) {
        System.out.println("Accelerate implemnetation from Vehicle");
        currentSpeed += speed;
        return currentSpeed /60; //60=minute, o ora

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

    @Override//method overriding
    public String toString() { //alt+insert-toString
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

