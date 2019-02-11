package chapter1;

/**
 * Displays the area and perimeter of a rectangle with given height/width
 * @author egrembocki
 */

public class checkpoint1_9 {

    public static void main(String[] args) {

        double height = 7.9;
        double width = 4.5;

        double perimeter = 2 * height + 2 * width;
        double area = height * width;

        System.out.println("The perimeter is " + perimeter);
        System.out.println("The area is " + area);
    }
}
