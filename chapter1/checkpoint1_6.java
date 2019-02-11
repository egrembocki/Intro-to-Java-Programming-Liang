package chapter1;

/**
 * Program takes a summation of a series and prints it to console
 * @author egrembocki
 */
public class checkpoint1_6 {

    private static int sum;

    public static void main(String[] args) {
        //for loop which adds summation of series to sum variable
        for(int i = 1; i <= 9; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
