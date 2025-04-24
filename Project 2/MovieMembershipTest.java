/*
 * Filename: /Users/howardbarde/Documents/INFO-6121Java/Project 2/MovieMembershipTest.java
 * Path: /Users/howardbarde/Documents/INFO-6121Java
 * Created Date: Thursday, August 16th 2024, 08:42:59 pm
 * Author: Howard Barde
 * Purpose: Project 2 for INFO6121-24S.
 * 
 * Copyright (c) 2024 Fanshawe-Map1 student
 */
public class MovieMembershipTest {
    
    public static void main(String[] args) {
        //1. Create 3 movie membership objects.
        SilverMember mySilver = new SilverMember("James Kelly", "Sonic The Hedgehog", "standard", 14, 30, "gummy bears");
        GoldMember myGold = new GoldMember("Richie Rich", "Wolf on Wallstreet", "standard", 18, 45, "popcorn");
        IMAXMember myIMAX = new IMAXMember("David Stu", "March of the Penguins", "IMAX", 10, 00, "nachos");
       //2. Create movieMembership array.
        MovieMembership[] movieMembershipArray = {mySilver, myGold, myIMAX};
        //3. Create for loop to traverse elements of movieMembershipArray.
        for (MovieMembership test : movieMembershipArray) {
            System.out.println("Member name: " + test.getMemberName());
            System.out.println("Member rank: " + test.returnMembershipRank());
            System.out.println("Points: " + test.getPoints());
            System.out.println("Next movie: " + test.getNextMovie());
            System.out.println("Theatre type: " + test.getTheatreType());  
            System.out.println("Showtime: " + test.displayShowTime());    
            System.out.println("Snack: " + test.getSnacks());
            System.out.println(test.getMemberDetails());
            test.printMemberBenefits();
        }
        //4. Create another for loop.
        for (MovieMembership how : movieMembershipArray) {
            how.purchaseMovieTicket(6.99, "The Matrix 4", "standard", 11, 25, "Sour keys");
            System.out.println(how.getMemberDetails());
        }
        //5. Invoke accessVIPLounge.
        System.out.print("\n");
        myGold.accessVIPLounge();
        //6. Invoke purchaseAlcohol and call getMemberDetails.
        System.out.println(myGold.purchaseAlcohol());
        System.out.println(myGold.getMemberDetails());
        System.out.print("\n");
        //7. Purchase movie ticket for silver.
        mySilver.purchaseMovieTicket(7.89, "Suicide Squad", "standard", 14, 25, "Smarties");
        //8. Purchase movie ticket for gold.
        myGold.purchaseMovieTicket(15.98, "The Big Short", "standard", 13, 50, "Kitkat");
        //9. Purchase movie ticket for imax.
        myIMAX.purchaseMovieTicket(14.50, "Godzilla vs Kong", "IMAX", 15, 0, "Gummies");
        //10. Call getMemberDetails for all objects.
        System.out.println(mySilver.getMemberDetails());
        System.out.println(myGold.getMemberDetails());
        System.out.println(myIMAX.getMemberDetails());
    }
}
