package chapter1;

/**
 * Solve a 2x2 System of Linear Equations using Cramer's Rule
 * @author egrembocki
 */

public class checkpoint1_13 {

    public static void main(String[] args) {

        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = .55;
        double e = 44.5;
        double f = 5.9;

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f -  e * c) / (a * d - b * c);

        System.out.printf("The value for x is %.2f and the value for y is " +
                "%.2f", x, y);
    }
}
