/*
 * Filename: /Users/howardbarde/Documents/INFO-6121Java/AutomobileTester.java
 * Path: /Users/howardbarde/Documents/INFO-6121Java
 * Created Date: Saturday, July 27th 2024, 07:30:41 pm
 * Author: Howard Barde
 * Purpose: Assignment 2 for INFO6121-24S. 
 * 
 * Copyright (c) 2024 Fanshawe-Map1 student
 */
public class AutomobileTester {
    //Added for the intro heading. I used methods just to look it neater.
    public static void heading() {
        System.out.println("Welcome to the Automobile tester!");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("This program will instantiate objects of Automobile and test its methods");
        System.out.println("------------------------------------------------------------------------\n");
    }
    //Added for string header. I used methods just to look it neater.
    public static String autoHeader(int num) {
        return "Auto " + num + " = ";
    }
    //Added for string header. I used methods just to look it neater.
    public static String autoHeader(String obj) {
        return obj + " = ";
    }
    public static void main(String[] args) {
        Automobile auto1 = new Automobile();
        Automobile auto2 = new Automobile("Nissan", "Frontier");
        Automobile auto3 = new Automobile("black", "GMC", "Sierra");
        heading();
        System.out.println(autoHeader(1) + auto1);
        System.out.println(autoHeader(2) + auto2);
        System.out.println(autoHeader(3) + auto3 + "\n");
        //Test getter methods for auto2 object
        System.out.println(autoHeader("Color") + auto2.getColour().toLowerCase());
        System.out.println(autoHeader("Make") + auto2.getMake());
        System.out.println(autoHeader("Model") + auto2.getModel() + "\n");
        //Update the properties of auto1 color => green, make => fiat, and model => Colorado
        auto1.setColour("green");
        auto1.setMake("Fiat");
        auto1.setModel("Colorado");
        //Print auto1
        System.out.println(autoHeader(1) + auto1);
    }
}
