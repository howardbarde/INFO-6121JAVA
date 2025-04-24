/*
 * Filename: /Users/howardbarde/Documents/INFO-6121Java/HB_FinalExam/CarnivalRideTester.java
 * Path: /Users/howardbarde/Documents/INFO-6121Java
 * Created Date: Saturday, August 21st 2024, 09:40:00 apm
 * Author: Howard Barde
 * Purpose: Finals for INFO6121-24S.
 * 
 * Copyright (c) 2024 Fanshawe-Map1 student
 */
import java.util.ArrayList;

public class CarnivalRideTester {
   
    //Added for the intro heading. I used methods just to look it neater.
    public static void heading() {
        System.out.println("Welcome to the Carnival Ride tester!");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("This program will instantiate objects of the Carnival Ride hierarchy and test their methods.");
        System.out.println("--------------------------------------------------------------------------------------------\n");
    }
    public static void main(String[] args) {
        //1. print header
        heading();
        //2. create objects
        Rollercoaster rcoast1 = new Rollercoaster(300000, 3);
        Rollercoaster rcoast2 = new Rollercoaster(420000, "Rocky Reller", 5);
        WaterRide wride1 = new WaterRide(200000, 18);
        WaterRide wride2 = new WaterRide(290000, "River Nile", 35);
        //3. print using to string
        System.out.println(rcoast1);
        System.out.println(rcoast2);
        System.out.println(wride1);
        System.out.println(wride2);
        //4. getters
        System.out.println("Ride type = " + wride2.getType());
        System.out.println("Ride name = " + wride2.getName());
        System.out.println("Ride duration = " + wride2.getDuration());
        System.out.println("Ride water drop = " +wride2.getWaterDrop() + "\n");
        //5. setters 
        wride2.setWaterDrop(95);
        rcoast1.setName("King Kong");
        //6. printer using getts
        System.out.println("Modified objects:");
        System.out.println("Ride water drop = " + wride2.getWaterDrop());
        System.out.println("Ride name = " + rcoast1.getName() + "\n");
        //7. Arraylist
        ArrayList<CarnivalRide> rideArray = new ArrayList<CarnivalRide>();
        rideArray.add(rcoast1);
        rideArray.add(rcoast2);
        rideArray.add(wride1);
        rideArray.add(wride2);
        //8. Print the arraylist
        for (CarnivalRide ride : rideArray) {
            System.out.println(ride.aboutRide());
        }
    }
}