package chapter2;
import java.util.Scanner;

public class listing2_3 {
    public static void main(String[] args) {
        //create Scanner object
        Scanner input = new Scanner(System.in);
        //prompts user to enter 3 numbers
        System.out.println("Enter 3 numbers.");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        //compute Average of 3 numbers
        double avg = (num1 + num2 + num3) / 3;
        System.out.println("The average of " + num1 + ", " + num2 + ", and " +
            num3 + " is " + avg);
    }
}
