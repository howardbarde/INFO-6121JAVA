/*
 * Filename: /Users/howardbarde/Documents/INFO-6121Java/PriceCalculator.java
 * Path: /Users/howardbarde/Documents/INFO-6121Java
 * Created Date: Thursday, June 06th 2024, 01:20:18 pm
 * Author: Howard Barde
 * Purpose: Assignment 1 for INFO6121-24S. I used OOP principles for practicing purpose.
 * 
 * Copyright (c) 2024 Fanshawe-Map1 student
 */

import java.util.Scanner;

public class PriceCalculator {
 
    final double HST = 0.13;
    final double THOUSAND = 1000.0;
    final double HUNDRED = 100.0;
    final double TEN = 10.0;
    final double FIVE = 5.0;
    final double ZERO = 0.0;
    static Scanner how = new Scanner(System.in);
    private String name = "";
    private String make = "";
    private double addingTemp = 0.0;
    private double totalPrice = 0.0;
    private double totalPriceWithSurcharge = 0.0;
    private double additionalShipFee = 0.0;
    private double totalPriceWithTax = 0.0;
    private double pricePerItem = 0.0;
    private double additionalCharge = 0.0;
    private int totalCount = 0;
    
    //constructor
    public PriceCalculator() {
        System.out.println("This program will allow you to calculate the total price of car items you wish to order");
    }
    //setter for name
    public void setName(String name) {
        this.name = name;
    }
    //getter for name
    public String getName() {
        return this.name;
    }
    //setter for make
    public void setMake(String make) {
        if (make.toLowerCase().equals("ford") || make.toLowerCase().equals("toyota") || make.toLowerCase().equals("hyundai") || 
            make.toLowerCase().equals("tesla") || make.toLowerCase().equals("subaru")) {
            System.out.println("Note: the makes of Ford, Toyota, Hyundai, Tesla, and Subaru incur additional fees");
        }
        this.make = make;
    }
    //getter for make
    public String getMake() {
        return this.make;
    }
    //get price
    public void getPrice() {
        while (true) {
            System.out.println("Please enter the price of each item you wish to order (Enter -1 to finish):");         
            if (how.hasNextDouble()) {
                addingTemp = how.nextDouble();
                if (addingTemp == -1) {
                    break;
                }
                this.totalPrice += addingTemp;
                this.totalCount++;
            } else {
                System.out.println("Invalid data type entered.");
                how.next();
            }
        }
    }
    //gets total count
    public double getTotalCount() {
        return this.totalCount;
    }
    //gets total price
    public double getTotalPrice() {
        return this.totalPrice;
    }
    //sets additional charge if necessary
    public void checkAdditionalCharge() {
        switch (this.getMake().toLowerCase()) {
            case "ford":
                this.additionalCharge = 5.0;
                break;
            case "toyota":
                this.additionalCharge = 20.0;
                break;
            case "hyundai":
                this.additionalCharge = 25.0;
                break;
            case "subaru":
                this.additionalCharge = 50.0;
                break;
            case "tesla":
                this.additionalCharge = 37.0;
                break;
            default:
                this.additionalCharge = 0.0;
                break;
        }
    }
    //gets additional charge
    public double getAdditionalCharge() {
        return this.additionalCharge;
    }
    //computes price with surcharge
    public void computePriceWithSurcharge() {
        this.totalPriceWithSurcharge = this.totalPrice + (this.totalPrice * (this.additionalCharge / HUNDRED));
        if (this.totalCount >= TEN) {
            this.additionalShipFee = TEN;
            this.totalPriceWithSurcharge = totalPriceWithSurcharge + (totalPriceWithSurcharge * (additionalShipFee / HUNDRED));
            System.out.println("Number of items ordered is greater than or equal to 10. Applying additional fee at 10%");
        } else if (this.totalCount >= FIVE && this.totalCount < TEN) {
            this.additionalShipFee = FIVE;
            this.totalPriceWithSurcharge = totalPriceWithSurcharge + (totalPriceWithSurcharge * (additionalShipFee / HUNDRED));
            System.out.println("Number of items ordered is greater than 5. Applying additional fee at 5%");
        } else {
            this.additionalShipFee = ZERO;
        }
    }
    //getter for price with surcharge
    public double getPriceWithSurcharge() {
        return Math.round(this.totalPriceWithSurcharge * THOUSAND) / THOUSAND;
    }
    //getter for additional shipping fee
    public double getShipFee() {
        return this.additionalShipFee;
    }
    //computes price with tax
    public double computePriceWithTax() {
        this.totalPriceWithTax = this.totalPriceWithSurcharge + (this.totalPriceWithSurcharge * HST);
        return totalPriceWithTax;
    }
    //getter for price per item
    public double getPricePerItem() {
        this.pricePerItem = this.totalPriceWithTax / this.totalCount;
        return this.pricePerItem;
    }

    public static void main(String[] args) {
        PriceCalculator howard = new PriceCalculator();
        System.out.println("Hello, what is your name?");
        howard.setName(how.nextLine());
        System.out.println("Hello, " + howard.getName());
        howard.getPrice();
        how.nextLine();
        System.out.print("Please enter the make of the car you wish to order parts for: ");
        howard.setMake(how.nextLine());
        howard.checkAdditionalCharge();
        howard.computePriceWithSurcharge();
        System.out.println(howard.getName() + ",");
        System.out.println("For the order of " + howard.getTotalCount() + " items");
        System.out.printf("%s $%.2f%n", "The order price is", howard.getTotalPrice());
        System.out.println("Ordering parts from " + howard.getMake() + " charges for an additional rate of " +  howard.getAdditionalCharge() + " percent");
        System.out.println("There is also additional fee of " + howard.getShipFee() + " percent");
        System.out.printf("%s $%.2f%n", "The price with additional fees and shipping is", howard.getPriceWithSurcharge());
        System.out.printf("%s $%.2f %s $%.2f %s", "The final price with tax comes to", howard.computePriceWithTax(), "with an average of", howard.getPricePerItem(), "per item");
        how.close();
    }
}
