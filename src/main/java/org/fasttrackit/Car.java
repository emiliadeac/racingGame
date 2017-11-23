package org.fasttrackit;

public class Car extends AutoVehicle {
     private int doorCount;


    public Car(Engine engine) { //consructor
        super(engine);
        this.doorCount = doorCount;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}

