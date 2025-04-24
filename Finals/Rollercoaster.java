/*
 * Filename: /Users/howardbarde/Documents/INFO-6121Java/HB_FinalExam/Rollercoaster.java
 * Path: /Users/howardbarde/Documents/INFO-6121Java
 * Created Date: Saturday, August 21st 2024, 09:40:00 apm
 * Author: Howard Barde
 * Purpose: Finals for INFO6121-24S.
 * 
 * Copyright (c) 2024 Fanshawe-Map1 student
 */
public class Rollercoaster extends CarnivalRide {
    private int loops;
    /**
     * 2 argument constructor
     * @param duration
     * @param loops
     */
    public Rollercoaster(long duration, int loops) {
        super("Rollercoaster", duration);
        this.loops = loops;
    }

    /**
     * 3 argument constructor
     * @param duration
     * @param name
     * @param loops
     */
    public Rollercoaster(long duration, String name, int loops) {
        super("Rollercoaster", duration, name);
        this.loops = loops;
    }

    /**
     * gets loops
     */
    public int getLoops() {
        return this.loops;
    }

    /**
     * sets loops
     */
    public void setLoops(int loops) {
        this.loops = loops;
    }

    /**
     * set strings for fear factor
     */
    @Override
    public String fearFactor() {
        String dscDur = "";
        String dscLoop = "";

        if(minutes() >= 6) {
            dscDur = "terrifying";
        } else if (minutes() >= 3) {
            dscDur = "scary";
        } else {
            dscDur = "not scary";
        }

        if(getLoops() >= 5) {
            dscLoop = "exhilarating";
        } else if (getLoops() >= 3) {
            dscLoop = "intermediate";
        } else {
            dscLoop = "moderate";
        }
        return "It is both " + dscDur + " and is " + dscLoop;
    }

    /**
     * sets string about ride
     */
    @Override
    public String aboutRide() {
        return "This carnival ride is a " + getType() + ", and its name is " + getName() + ".\n" + fearFactor() + "\nThis ride lasts " + minutes() +
        " minutes and has " + getLoops() + " loops\n";
    }

    /**
     * returns to string
     */
    @Override
    public String toString() {
        return super.toString() + "\nLoops:\t\t" + getLoops() + "\n";
    }
}