/*
 * Filename: /Users/howardbarde/Documents/INFO-6121Java/Project1Test.java
 * Path: /Users/howardbarde/Documents/INFO-6121Java
 * Created Date: Thursday, May 30th 2024, 10:40:18 am
 * Author: Howard Barde
 * Purpose: Project 1 for INFO6121-24S - Railcar Capacity Calculator
 * 
 * Copyright (c) 2024 Fanshawe-Map1 student
 */

import java.util.Scanner;

public class Project1Test {
    final private int MINIMUM_AUTOMOBILE_ALLOWED_TO_BE_SHIPPED = 36;
    final private int MINIMUM_AUTOMOBILE_PER_RAILCAR = 36;
    final private int MAXIMUM_AUTOMOBILE_PER_RAILCAR = 48; 
    final private int MINIMUM_RAILCAR_ALLOWED = 1;
    final private double HUNDRED_PERCENT = 100.0;
    static Scanner how = new Scanner(System.in);
    private String company = "";
    private int automobile = 0;
    private int automobilePerRailcar = 0;
    private int railcars = 0;
    private int minimumRailCarsNeeded = 0;
    private int noOfAutomobilesThatCanBeShipped = 0;
    private double noOfAutomobilesThatCanBeShippedPercent = 0.0;
    private double leftBehindPercent = 0.0;

    //constructor. no parameter for this project
    public Project1Test() {
        System.out.println("Welcome to Howard's\nTrain Master Railcar Capacity Analysis");
        addLine();
        System.out.println("Description:");
        System.out.println("This is a railcar capacity calculator that uses loops and conditions.\nI used OOP principles for practicing purposes.");
        addLine();
    }
    //setter for company name
    public void setCompany(String companyName) {
        this.company = companyName;
    }
    //getter for company name
    public String getCompany() {
        return this.company;
    }
    //setter for automobile valdiation to check input # 1 - number of automobiles to be shipped by the company. Value > 36
    public void setAutomobile(int auto) {
        if (auto < MINIMUM_AUTOMOBILE_ALLOWED_TO_BE_SHIPPED) {
            System.out.print("Error: Number of automobiles must be at least " + MINIMUM_AUTOMOBILE_ALLOWED_TO_BE_SHIPPED + ". Try again: ");
            this.automobile = how.nextInt();
        } else {
            this.automobile = auto;
        }
        while (this.automobile < MINIMUM_AUTOMOBILE_ALLOWED_TO_BE_SHIPPED) {
            System.out.print("Error: Number of automobiles must be at least " + MINIMUM_AUTOMOBILE_ALLOWED_TO_BE_SHIPPED + ". Try again: ");
            this.automobile = how.nextInt();
        }
    }
    //getter for automobile
    public int getAutomobile() {
        return this.automobile;
    }
    //setter for automobile per railcar valdiation to check input # 2 - maximum number of automobile per railcar. Value between 36 and 48
    public void setAutomobilePerRailCar(int autoRail) {
        this.automobilePerRailcar = autoRail;
        while (this.automobilePerRailcar < MINIMUM_AUTOMOBILE_PER_RAILCAR || this.automobilePerRailcar > MAXIMUM_AUTOMOBILE_PER_RAILCAR) {
            if (this.automobilePerRailcar < MINIMUM_AUTOMOBILE_PER_RAILCAR) {
                System.out.print("Error: No railcars have that low capacity. Try again: ");
                this.automobilePerRailcar = how.nextInt();
            }
            if (this.automobilePerRailcar > MAXIMUM_AUTOMOBILE_PER_RAILCAR) {
                System.out.print("Error: No railcars have that high capacity. Try again: ");
                this.automobilePerRailcar = how.nextInt();
            }
        }
    }
    //getter for automobile per railcar
    public int getAutomobilePerRailCar() {
        return this.automobilePerRailcar;
    }
    //setter for railcars valdiation to check input # 3 - number of rail cars available at the company. Value at least 1
    public void setRailCars(int cars) {
        this.railcars = cars;
        while (this.railcars < MINIMUM_RAILCAR_ALLOWED) {
            System.out.print("Error: Number of railcars that are available must be at least " + MINIMUM_RAILCAR_ALLOWED + ". Try again: ");
            this.railcars = how.nextInt();
        }
    }
    //getter for railcars
    public int getRailCars() {
        return this.railcars;
    }
    public void addLine() {
        System.out.println("----------------------------------------------------------------------------");
    }
    //number of automobiles / maximum number of automobiles per railcar. Use math ceiling to round off
    public int getMinOfRailCars() {
        this.minimumRailCarsNeeded = (int) Math.ceil((float) this.automobile / this.automobilePerRailcar);
        return this.minimumRailCarsNeeded;
    }
    //if number of railcars that are available exceeds the minimum number of railcars required, there will be nothing left behind. If not, rail cars * automobiles
    public int getAutomobilesThatCanBeShipped() {
        if (this.railcars >= this.minimumRailCarsNeeded) {
            this.noOfAutomobilesThatCanBeShipped = this.automobile;
        } else {
            this.noOfAutomobilesThatCanBeShipped = this.railcars * this.automobilePerRailcar;
        }
        return this.noOfAutomobilesThatCanBeShipped;
    }
    //setter automobiles that can be shipped / automobiles to ship
    public double getAutomobilesThatCanBeShippedPercent() {
        this.noOfAutomobilesThatCanBeShippedPercent = (double) this.noOfAutomobilesThatCanBeShipped / this.automobile;
        this.noOfAutomobilesThatCanBeShippedPercent *= HUNDRED_PERCENT;
        return this.noOfAutomobilesThatCanBeShippedPercent;
    }
    //get the difference then divide to get percentage
    public double getLeftBehindPercent() {
        int temp = this.automobile - this.noOfAutomobilesThatCanBeShipped;
        this.leftBehindPercent = (double) temp / this.automobile;
        this.leftBehindPercent *= HUNDRED_PERCENT;
        return this.leftBehindPercent;
    }
    public static void main(String[] args) {
        Project1Test howard = new Project1Test();
        System.out.print("Enter name of the railway company: ");
        howard.setCompany(how.nextLine());
        System.out.print("Enter number of automobiles to be shipped by " + howard.getCompany() + ": ");
        howard.setAutomobile(how.nextInt());
        System.out.print("Enter maximum number of automobiles per railcar: ");
        howard.setAutomobilePerRailCar(how.nextInt());
        System.out.print("Enter number of railcars that are available at " + howard.getCompany() + ": ");
        howard.setRailCars(how.nextInt());
        howard.addLine();
        System.out.println("Howard's, Train Master Report for " + howard.getCompany());
        howard.addLine();
        System.out.printf("%-40s %20d %n", "Required number of automobiles to ship:", howard.getAutomobile());
        System.out.printf("%-40s %20d %n", "Minimum number of railcars required:", howard.getMinOfRailCars());
        System.out.printf("%-40s %20d %n","Number of railcars available:", howard.getRailCars());
        System.out.printf("%-40s %18d%s %10.1f%%%n","Number of automobiles that can be shipped:", howard.getAutomobilesThatCanBeShipped(), ",", howard.getAutomobilesThatCanBeShippedPercent());
        System.out.printf("%-40s %20d%s %10.1f%%%n","Number of automobiles left behind:", (howard.getAutomobile() - howard.getAutomobilesThatCanBeShipped()), ",", howard.getLeftBehindPercent());
        how.close();
    }
}
