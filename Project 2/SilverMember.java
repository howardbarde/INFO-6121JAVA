/*
 * Filename: /Users/howardbarde/Documents/INFO-6121Java/Project 2/SilverMember.java
 * Path: /Users/howardbarde/Documents/INFO-6121Java
 * Created Date: Thursday, August 16th 2024, 07:41:34 pm
 * Author: Howard Barde
 * Purpose: Project 2 for INFO6121-24S.
 * 
 * Copyright (c) 2024 Fanshawe-Map1 student
 */

 /**
  * Class for silver members that extends MovieMembership class
  */
public class SilverMember extends MovieMembership {
    private double discountRate;
    private double pointsRate; 

    /**
     * Constructor for the SilverMember class with 1 argument.
     * @param memberName
     */
    public SilverMember(String memberName) {
        super(memberName);
        this.discountRate = 0.1;
        this.pointsRate = 1.2;
    }

    /**
     * Constructor for the SilverMember class with 3 arguments.
     * @param memberName
     * @param discountRate
     * @param pointsRate
     */
    public SilverMember(String memberName, double discountRate, double pointsRate) {
        super(memberName);
        this.discountRate = discountRate;
        this.pointsRate = pointsRate;
    }

    /**
     * Constructor for the SilverMember class with 6 arguments. 
     * @param memberName
     * @param nextMovie
     * @param theatreType
     * @param showHour
     * @param showMinute
     * @param snack
     */
    public SilverMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute, String snack) {
        super(memberName, nextMovie, theatreType, showHour, showMinute, snack);
        this.discountRate = 0.1;
        this.pointsRate = 1.2;
    }

    /**
     * Constructor for the SilverMember class with 8 arguments.
     * @param memberName
     * @param nextMovie
     * @param theatreType
     * @param showHour
     * @param showMinute
     * @param snack
     * @param discountRate
     * @param pointsRate
     */
    public SilverMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute, String snack, double discountRate, double pointsRate) {
        super(memberName, nextMovie, theatreType, showHour, showMinute, snack);
        this.discountRate = discountRate;
        this.pointsRate = pointsRate;
    }

    /**
     * Overridden method. Gets member details. Invokes superclass's version and concatenates it.
     */
    @Override
    public String getMemberDetails() {
        return super.getMemberDetails() + "They have " + returnMembershipRank() + " membership.";
    }

    /**
     * Overridden method. Prints discount and points rate.
     */
    @Override
    public void printMemberBenefits() {
        System.out.println("Discount rate = " + this.discountRate * 100 + "%");
        System.out.println("Points gained per dollar = " + this.pointsRate + "\n");
    }

    /**
     * Overridden method. Returns membership rank
     */
    @Override
    public String returnMembershipRank() {
        return "Silver";
    }

    /**
     * Overridden method. Purchase ticket
     */
    @Override
    public void purchaseMovieTicket(double ticketPrice, String nextMovie, String theatreType, int showHour, int showMinute, String snack) {
        double priceWithDiscount = ticketPrice * (1 - discountRate);
        int pointsEarned = (int)(ticketPrice * this.pointsRate);
        setNextMovie(nextMovie);
        setShowTime(showHour, showMinute);
        setTheatreType(theatreType);
        setSnack(snack);
        addPoints(pointsEarned);
        System.out.println("The Movie " + nextMovie + " has been purchased by " + getMemberName() + " for " + priceWithDiscount + " and will be showing at "
            + showHour + ":" + showMinute + " with " + theatreType + " screening. " + "They have earned " + pointsEarned + " points");
    }
    
}
