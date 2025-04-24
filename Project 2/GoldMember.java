/*
 * Filename: /Users/howardbarde/Documents/INFO-6121Java/Project 2/GoldMember.java
 * Path: /Users/howardbarde/Documents/INFO-6121Java
 * Created Date: Thursday, August 16th 2024, 07:55:14 pm
 * Author: Howard Barde
 * Purpose: Project 2 for INFO6121-24S.
 * 
 * Copyright (c) 2024 Fanshawe-Map1 student
 */
import java.util.Scanner;

public class GoldMember extends SilverMember implements VIPPrivilege {
    private boolean validCredentials;
    /**
     * Constructor for GoldMember with 1 argument.
     * @param memberName
     */
    public GoldMember(String memberName) {
        //public SilverMember(String memberName, double discountRate, double pointsRate) {
        super(memberName, 0.25, 2.0);
        this.validCredentials = false;
        addPoints(50);
    }

    /**
     * Constructor for GoldMember with 6 arguments.
     * @param memberName
     * @param nextMovie
     * @param theatreType
     * @param showHour
     * @param showMinute
     * @param snack
     */
    public GoldMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute, String snack) {
        //public SilverMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute, String snack, double discountRate, double pointsRate) {
        super(memberName, nextMovie, theatreType, showHour, showMinute, snack, 0.25, 2.0);
        this.validCredentials = false;
        addPoints(50);
    }

    /**
     * Overridden method. Returns membership rank.
     */
    @Override
    public String returnMembershipRank() {
        return "Gold";
    }

    /**
     * Overridden method. Returns membership details.
     */
    @Override
    public String getMemberDetails() {
        return super.getMemberDetails() + " and VIP privileges.";
    }

    /**
     * Acess VIP lounge. Gets password from user.
     */
    public void accessVIPLounge() {
        Scanner vip = new Scanner(System.in);
        System.out.println("Enter password:");
        int password = vip.nextInt();
        if (password == VIPPrivilege.PASSWORD) {
            this.validCredentials = true;
            System.out.println("Access granted!");
        }
        vip.close();
    }

    /**
     * Purchase alcohol. Validate if user have valid credentials.
     */
    public String purchaseAlcohol() {
        if (this.validCredentials) {
            setSnack("alcohol");
            return "Enjoy your beverage";
        }

        return "Beverage cannot be purchased because no valid password has been entered.";
    }
}
