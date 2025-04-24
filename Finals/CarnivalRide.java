/*
 * Filename: /Users/howardbarde/Documents/INFO-6121Java/HB_FinalExam/CarnivalRide.java
 * Path: /Users/howardbarde/Documents/INFO-6121Java
 * Created Date: Saturday, August 21st 2024, 09:40:00 apm
 * Author: Howard Barde
 * Purpose: Finals for INFO6121-24S.
 * 
 * Copyright (c) 2024 Fanshawe-Map1 student
 */
public abstract class CarnivalRide {
    private String type;
    private long duration;
    private String name;

    /**
     * 2 argument constructor
     * @param type
     * @param duration
     */
    public CarnivalRide(String type, long duration) {
        this.name = "unknown";
        this.type = type;
        this.duration = duration;
    }

    /**
     * 3 argument constructor
     * @param type
     * @param duration
     * @param name
     */
    public CarnivalRide(String type, long duration, String name) {
        this.name = name;
        this.type = type;
        this.duration = duration;
    }

    /**
     * gets type
     * @return
     */
    public String getType() {
        return this.type;
    }

    /**
     * gets duration
     * @return
     */
    public long getDuration() {
        return this.duration;
    }

    /**
     * gets name
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * sets type
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * sets duration
     * @param duration
     */
    public void setDuration(long duration) {
        this.duration = duration;
    }

    /**
     * sets name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * abstract methods
     * @return
     */
    public abstract String fearFactor();
    public abstract String aboutRide();

    /**
     * converts to minutes
     * @return
     */
    public int minutes() {
        return (int) (getDuration() / 60000) ;
    }

    /**
     * returns string
     */
    public String toString() {
        return "Type:\t\t" + getType() + "\nDuration:\t" + getDuration() + "\nName:\t\t" + getName();
    }
}