package chapter2;
import java.util.Scanner;

/*
Use of constants
 */
public class listing2_4 {
    public static void main(String[] args) {
        //declare constant
        final double PI = 3.14159;
        //create a scanner object
        Scanner input = new Scanner(System.in);
        //prompt user to enter radius
        System.out.println("Enter a radius ");
        double radius = input.nextDouble();
        //compute area
        double area = radius * radius * PI;
        //display area
        System.out.println("The area for the circle with radius " + radius + " is " + area);


    }
}
