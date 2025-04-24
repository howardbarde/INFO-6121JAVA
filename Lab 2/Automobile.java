/*
 * Filename: /Users/howardbarde/Documents/INFO-6121Java/Automobile.java
 * Path: /Users/howardbarde/Documents/INFO-6121Java
 * Created Date: Saturday, July 27th 2024, 07:20:38 pm
 * Author: Howard Barde
 * Purpose: Assignment 2 for INFO6121-24S.
 * 
 * Copyright (c) 2024 Fanshawe-Map1 student
 */
import java.lang.Math;

public class Automobile {
    
    // private static final String[] COLORS = {"Black", "Grey", "Silver", "White", "Blue", "Red", "Yellow"};
    // private final int MIN = 0;
    // private final int MAX = 6;
    private String colour;
    private String make;
    private String model;

    //no-argument constructor
    public Automobile() {
        this.make = null;
        this.model = null;
        defaultColour();
    }
    //2-argument constructor
    
    public Automobile(String make, String model) {
        this.make = make;
        this.model = model;
        defaultColour();
    }
    //3-argument constructor
    public Automobile(String colour, String make, String model) {
        this.make = make;
        this.model = model;
        this.colour = colour;
    }
    //Gets random colour from the array - colors
    private void defaultColour() {
        String[] colors = {"Black", "Grey", "Silver", "White", "Blue", "Red", "Yellow"};
        int min = 0;
        int max = 6;
        int index = (int)(Math.random() * (max - min + 1)) + min;
        this.colour = colors[index];
    }
    //Getter for colour
    public String getColour() {
        return this.colour;
    }
    //Getter for make
    public String getMake() {
        return this.make;
    }
    //Getter for model
    public String getModel() {
        return this.model;
    }
    //Setter for colour
    public void setColour(String colour) {
        this.colour = colour;
    }
    //Setter for make
    public void setMake(String make) {
        this.make = make;
    }
    //Setter for model
    public void setModel(String model) {
        this.model = model;
    }
    //Returns the string representation of the object
    public String toString() {
        return this.colour.toLowerCase() + " " + this.make + " " + this.model;
    }
}
