package org.fasttrackit;

public class AutoVehicle extends Vehicle {

    private Engine engine;

    public AutoVehicle(Engine engine) {
        this.engine = engine;  //this, pentru a apele variabla obiectului care are acealsi nume

    System.out.println("Custom constructor called");}


    public AutoVehicle() { //constructor overloading
        this(new Engine());
    }


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
