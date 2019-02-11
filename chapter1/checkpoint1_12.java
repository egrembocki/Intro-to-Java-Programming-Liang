package chapter1;

/**
 * Assume a runner runs 24 miles in 1 hour, 40 minutes and 35 seconds. Write
 * a program that displays the avg speed in km/h
 * @author egrembocki
 */
public class checkpoint1_12 {

    public static void main(String[] args) {
        //calculate time in hours and distance in km
        double km = 24 * 1.6;
        double hours = 100.583 / 60;
        //calculate kmh and print
        double kmh = km / hours;
        System.out.printf("The speed is %.2f km/h.", kmh);

    }
}
