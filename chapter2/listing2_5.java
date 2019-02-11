package chapter2;

import java.util.Scanner;

public class listing2_5 {
    public static void main(String[] args) {
        //import scanner
        Scanner input = new Scanner(System.in);
        //prompt the user for input
        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(seconds + " seconds is " + minutes + " minutes and "
            + remainingSeconds + " seconds");
    }
}
