package org.fasttrackit;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Vehicle {
    private String name;
    private String color;

    public double accelerate (double speed) {    //declararea metodei/semnatura metodei

        System.out.println(speed); //apelarea metodei
        //
        return 10.1; //declararea metodei double (public)

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
}
