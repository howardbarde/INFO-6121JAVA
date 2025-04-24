/*
 * Filename: /Users/howardbarde/Documents/INFO-6121Java/Project 2/MovieMembership.java
 * Path: /Users/howardbarde/Documents/INFO-6121Java
 * Created Date: Thursday, August 16th 2024, 07:20:38 pm
 * Author: Howard Barde
 * Purpose: Project 2 for INFO6121-24S.
 * 
 * Copyright (c) 2024 Fanshawe-Map1 student
 */
public abstract class MovieMembership {
    private String memberName;
    private String nextMovie;
    private String theatreType;
    private String snack;
    private int showHour;
    private int showMinutes;
    private int points;

    /**
     * Constructor for MovieMembership with 1 argument.
     * @param memberName
     */
    public MovieMembership(String memberName) {
        this.memberName = memberName;
        this.nextMovie = "unkown";
        this.theatreType = "standard";
        this.showHour = 0;
        this.showMinutes = 0;
        this.snack = "unkown";
        this.points = 0;
    }

    /**
     * Constructor for MovieMembership with 6 arguments.
     * @param memberName
     * @param nextMovie
     * @param theareType
     * @param showHour
     * @param showMinute
     * @param snack
     */
    public MovieMembership(String memberName, String nextMovie, String theareType, int showHour, int showMinute, String snack) {
        this.memberName = memberName;
        this.nextMovie = nextMovie;
        this.theatreType = theareType;
        this.showHour = showHour;
        this.showMinutes = showMinute;
        this.snack = snack;
        this.points = 0;
    }

    /**
     * Gets memberName 
     * @return
     */
    public String getMemberName() {
        return this.memberName;
    }

    /**
     * Gets nextMovie
     * @return
     */
    public String getNextMovie() {
        return this.nextMovie;
    }

    /**
     * Gets points
     * @return
     */
    public int getPoints() {
        return this.points;
    }

    /**
     * Gets snacks
     * @return
     */
    public String getSnacks() {
        return this.snack;
    }

    /**
     * Gets theatreType
     * @return
     */
    public String getTheatreType() {
        return this.theatreType;
    }

    /**
     * Sets nextMovie
     * @param nextMovie
     */
    public void setNextMovie(String nextMovie) {
        this.nextMovie = nextMovie;
    }
    
    /**
     * Sets snack
     * @param snack
     */
    public void setSnack(String snack) {
        this.snack = snack;
    }

    /**
     * Sets theatreType
     * @param theatreType
     */
    public void setTheatreType(String theatreType) {
        this.theatreType = theatreType;
    }

    /**
     * Sets showTime
     * @param hour
     * @param minute
     */
    public void setShowTime(int hour, int minute) {
        this.showHour = hour;
        this.showMinutes = minute;
    }

    /**
     * Displays showHour + showMinutes
     * @return
     */
    public String displayShowTime() {
        return this.showHour + ":" + this.showMinutes;
    }

    /**
     * Adds points
     * @param points
     */
    public void addPoints(int points) {
        this.points += points;
    }

    /**
     * Displays member details
     * @return
     */
    public String getMemberDetails() {
        return "This membership belongs to " + getMemberName() + ". They have " + getPoints() + " points. Their next movie is \n" +
                getNextMovie() + " at " + displayShowTime() + " with a " + getTheatreType() + " screening. They will be having " + getSnacks() + 
                "\nas a snack. " ;
               
    }

    /**
     * Abstract methods
     * @return
     */
    public abstract String returnMembershipRank();
    public abstract void printMemberBenefits();
    public abstract void purchaseMovieTicket(double ticketPrice, String nextMovie, String theatreType, int showHour, int showMinute, String snack);
}
