package chapter2;
//display current time
public class listing2_7 {
    public static void main(String[] args) {
        //current time in milliseconds
        long totalMilliseconds = System.currentTimeMillis();
        //total time in seconds
        long totalSeconds = totalMilliseconds / 1000;
        //current second
        long currentSecond = totalSeconds % 60;
        //total minutes
        long totalMinutes = totalSeconds / 60;
        //compute current minute in hour
        long currentMinute = totalMinutes % 60;
        //obtain total hours
        long totalHours = totalMinutes / 60;
        //compute the current hour
        long currentHour = totalHours % 24;

        //display current time in GMT
        System.out.println("The current time is " + currentHour + ":"
            + currentMinute + ":" + currentSecond + " GMT");

    }
}
