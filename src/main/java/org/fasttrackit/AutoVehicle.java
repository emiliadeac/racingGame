package org.fasttrackit;

public class AutoVehicle extends Vehicle {
    private double mileage;
    private double fuelLevel;
    private Engine engine;

    public AutoVehicle(Engine engine) {
        this.engine = engine;  //this, pentru a apele variabla obiectului care are acealsi nume

    System.out.println("Custom constructor called");}


    public AutoVehicle() { //constructor overloading
        this(new Engine());
    }

    @Override
    public double accelerate(double speed) {
        //return super.accelerate(speed); super cheama de la clasa parinte
       // setCurrentSpeed(getCurrentSpeed()+ speed);
        System.out.println("Accelerate implemnetation from Autovehicle");
        double finalSpeed = getCurrentSpeed () + speed;
        setCurrentSpeed (finalSpeed);
        double travelDistance = finalSpeed /60;
        double spentFuel = travelDistance * mileage /100;
        fuelLevel -=spentFuel;
        //same as fuelLevel = fuelLevel - spentFuel;

        return travelDistance;
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

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
