package chapter2;
import java.util.Scanner;

public class listing2_2 {
    public static void main(String[] args) {
        //create a Scanner object
        Scanner input = new Scanner(System.in);
        //prompt the user to enter a radius
        System.out.print("Enter a radius: ");
        double radius = input.nextDouble();
        //compute area
        double area = radius * radius * Math.PI;
        //display area
        System.out.println("The area for the circle with radius " + radius + " is " + area);
    }

}
