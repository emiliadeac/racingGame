package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Race race = new Race();
        Track track = new Track();
        track.length = 100;
        race.track = track;

        Engine engine = new Engine();
        engine. manufacturer = "Volvo";

        Car car1 = new Car();
        car1.name = "Volvo";
        car1.color= "black";
        car1.fuelLevel = 100.00;
        car1.mileage = 12.5;
        car1.doorCount = 4;
        car1.engine = engine;


        Engine engine2= new Engine();
        engine2.manufacturer = "Honda";

        Car car2 = new Car();
        car2.name = "Honda";
        car2.color = "red";
        car2.fuelLevel = 100;
        car2.mileage = 13.5;
        car2.doorCount = 2;
        car2.engine= engine2;
    }
}
