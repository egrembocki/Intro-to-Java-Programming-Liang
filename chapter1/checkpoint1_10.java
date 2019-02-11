package chapter1;

/**
 * Assume a runner runs 14 km in 45 mins and 30s. Write a program that displays
 * the average speed in mph
 * @author egrembocki
 */
public class checkpoint1_10 {

    public static void main(String[] args) {

        double miles = 14 / 1.6;
        double hours = 45.5 / 60;

        double mph = miles / hours;

        System.out.println(mph);
    }
}
