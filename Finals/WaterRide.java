/*
 * Filename: /Users/howardbarde/Documents/INFO-6121Java/HB_FinalExam/WaterRide.java
 * Path: /Users/howardbarde/Documents/INFO-6121Java
 * Created Date: Saturday, August 21st 2024, 09:40:00 apm
 * Author: Howard Barde
 * Purpose: Finals for INFO6121-24S.
 * 
 * Copyright (c) 2024 Fanshawe-Map1 student
 */
public class WaterRide extends CarnivalRide {
    private double waterdrop;

    /**
     * 2 argument constructot
     * @param duration
     * @param waterdrop
     */
    public WaterRide(long duration, double waterdrop) {
        super("Water Ride", duration);
        this.waterdrop = waterdrop;
    }
    
    /**
     * 3 argument constructor
     * @param duration
     * @param name
     * @param waterdrop
     */
    public WaterRide(long duration, String name, double waterdrop) {
        super("Water Ride", duration, name);
        this.waterdrop = waterdrop;
    }

    /**
     * gets water drop
     * @return
     */
    public double getWaterDrop() {
        return this.waterdrop;
    }

    /**
     * sets water drop
     * @param waterdrop
     */
    public void setWaterDrop(double waterdrop) {
        this.waterdrop = waterdrop;
    }

    /**
     * sets string for fear factor
     * @return
     */
    @Override
    public String fearFactor() {
        String dscDur = "";
        String dscLoop = "";

        if(minutes() >= 7) {
            dscDur = "long and engaging";
        } else if (minutes() >= 5) {
            dscDur = "fun and respectable";
        } else {
            dscDur = "very short";
        }

        if(getWaterDrop() >= 40) {
            dscLoop = "suitable for fearless adults";
        } else if (getWaterDrop() >= 20) {
            dscLoop = "suitable for most adults";
        } else {
            dscLoop = "safe for children";
        }
        return "It is both " + dscDur + " and is " + dscLoop + ".";
    }

    /**
     * sets string about ride
     * @return
     */
    @Override
    public String aboutRide() {
        return "This carnival ride is a " + getType() + ", and its name is " + getName() + ".\n" + fearFactor() + "\nThis ride lasts " + minutes() +
        " minutes and has a water drop of " + getWaterDrop() + " meters\n";
    }

    /**
     * returns to string
     */
    @Override
    public String toString() {
        return super.toString() + "\nWater Drop:\t" + getWaterDrop() + "\n";
    }
}