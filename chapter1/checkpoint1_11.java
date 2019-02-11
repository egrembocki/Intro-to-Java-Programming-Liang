package chapter1;

/**
 * Population Projection
 * - One birth every 7 seconds
 * - One death every 13 seconds
 * - One new immigrant every 45 seconds
 *
 * Write a program to display the population for the next 5 years.
 * Current population is 312,032,486; One year has 365 days
 * @author egrembocki
 */

public class checkpoint1_11 {


    public static void main(String[] args) {

        int currentPop = 312032486;
        //there are 86400 seconds in a day
        double birthsPerDay = 86400 / 7.0;
        double deathsPerDay = 86400 / 13.0;
        double immigrantsPerDay = 86400 / 45.0;

        //calculate # of days in 5 year period
        int totalDays = 365 * 5;

        double popGrowth = currentPop + ((birthsPerDay + immigrantsPerDay - deathsPerDay)
                * totalDays);
        //prints total population growth over 5 years
        System.out.printf("The population is approximately %.0f\n", popGrowth);

    }
}
