package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private Track track;
    private Vehicle [] competitors = new Vehicle[10]; //[]siruri de obiecte
    private List <Vehicle> competitorList = new ArrayList<Vehicle>();

    public void start (){
        Engine engine = new Engine();
        engine.setManufacturer("Volvo");

        Vehicle firstCompetitor = createCompetitor(engine,"Volvo", "red", 40, 8.5,4);
        //System.out.println(firstCompetitor.toString()); //toString

        Engine engine2= new Engine();
        engine2.setManufacturer("Honda");
        Vehicle secondCompetitor = createCompetitor(engine2, "Honda", "green", 70, 10.6, 2);
        //System.out.println(secondCompetitor.toString());
        competitors[0] =firstCompetitor;//0 pozitia din sir ! incepe de la 0
        competitors [1] =secondCompetitor;


        for (int i = 0; i <competitors.length; i++) {
            if (competitors[i] != null) {      // != diferit de nul
                System.out.println("Competitor"+ i + ": " + competitors[i].getName());
            } }
            //enhanced for
            for (Vehicle vehicle : competitors) {
            if (vehicle != null){
                System.out.println(vehicle.getName());
                //for loops used in the same way for arrays and lists
                for (Vehicle vehicle1 : competitorList){
                    if (vehicle != null) {
                        System.out.println( vehicle.getName());
                    }
                }
            }
            }
            //example for reading and writting list elements
        competitorList.get(0);
        competitorList.add( new Vehicle());
        competitorList.add(1, new Vehicle());
    }


//METODA
// parameters contain car prefix just to demo; they can have any name
    private Vehicle createCompetitor (Engine carEngine, String carName, String carColor, double carFuelLevel, double carMileage, int carDoorCount  ){
        Car competitor = new Car(carEngine);
        competitor.setName(carName);
        competitor.setColor(carColor);
        competitor.setFuelLevel(carFuelLevel);
        competitor.setMileage(carMileage);
        competitor.setDoorCount(carDoorCount);

        return competitor;
    }




    //public Vehicle getFirstCompetitor() {
        //return firstCompetitor;}

    //public void setFirstCompetitor(Vehicle firstCompetitor) {
       // this.firstCompetitor = firstCompetitor;}

   // public Vehicle getSecondCompetitor() {
        //return secondCompetitor; }

    //public void setSecondCompetitor(Vehicle secondCompetitor) {
        //this.secondCompetitor = secondCompetitor;}

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }
}
