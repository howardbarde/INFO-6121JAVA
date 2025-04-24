/*
 * Filename: /Users/howardbarde/Documents/INFO-6121Java/Project 2/IMAXMember.java
 * Path: /Users/howardbarde/Documents/INFO-6121Java
 * Created Date: Thursday, August 16th 2024, 08:12:22 pm
 * Author: Howard Barde
 * Purpose: Project 2 for INFO6121-24S.
 * 
 * Copyright (c) 2024 Fanshawe-Map1 student
 */
public class IMAXMember extends MovieMembership {
    private double discountRate;
    private double pointsRate;

    /**
     * Constructor for IMAXMember class with 1 argument.
     * @param memberName
     */
    public IMAXMember(String memberName) {
        //public MovieMembership(String memberName) {
        super(memberName);
        if(getTheatreType().equals("IMAX")) {
            this.discountRate = 0.5;
            this.pointsRate = 1.3;
        }
        addPoints(25);
    }

    /**
     * Constructor for IMAXMember class with 6 arguments.
     * @param memberName
     * @param nextMovie
     * @param theatreType
     * @param showHour
     * @param showMinute
     * @param snack
     */
    public IMAXMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute, String snack) {
        //public MovieMembership(String memberName, String nextMovie, String theareType, int showHour, int showMinute, String snack) {
        super(memberName, nextMovie, theatreType, showHour, showMinute, snack);
        if(getTheatreType().equals("IMAX")) {
            this.discountRate = 0.5;
            this.pointsRate = 1.3;
        }
        addPoints(25);
    }

    /**
     * Overridden method. Prints discount and points rate.
     */
    @Override
    public String getMemberDetails() {
        return super.getMemberDetails() + " They have IMAX membership.";
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
        return "IMAX";
    }

    /**
     * Overridden method. Purchase ticket
     */
    @Override
    public void purchaseMovieTicket(double ticketPrice, String nextMovie, String theatreType, int showHour, int showMinute, String snack) {
        if (theatreType.equals("IMAX")) {
            this.discountRate = 0.5;
            this.pointsRate = 1.3;
        } else {
            this.discountRate = 0;
            this.pointsRate = 0;
        }
        double priceWithDiscount = ticketPrice * (1 - this.discountRate);
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
