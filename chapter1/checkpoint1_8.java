package chapter1;

/**
 * Displays the area and perimeter of a circle with radius 5.5
 * @author egrembocki
 */
public class checkpoint1_8 {

    public static void main(String[] args) {

        double radius = 5.5;
        double perimeter = 2 * radius * Math.PI;
        double area = radius * radius * Math.PI;

        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + perimeter);

    }
}
