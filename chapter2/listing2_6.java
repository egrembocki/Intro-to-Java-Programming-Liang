package chapter2;

import java.util.Scanner;

public class listing2_6 {
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        //convert fahrenheit to celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is "+ celsius +
                " celsius.");
    }
}
