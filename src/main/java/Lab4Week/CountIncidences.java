package Lab4Week;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.positiveDoubleInput;

public class CountIncidences {

    public static void main(String[] args) {

        List<Double> speeds = new ArrayList<>();

        int totalHours = 12;

        for (int hour = 0; hour < totalHours; hour++) {
            double speed = positiveDoubleInput("Enter the internet speed for " + hour);
            speeds.add(speed);
        }

        System.out.println("All the speeds are:");

        for (int hour = 0; hour < speeds.size(); hour++) {
            double speed = speeds.get(hour);
            System.out.printf("Hour: %d  Speed: %.2f.\n", hour, speed);
        }

        //Count the number of times the speed was zero.

        int zeroCount = 0;

        for (double speed : speeds) {
            if (speed == 0) {
                zeroCount++;
            }
        }
        System.out.println("Number of times speed was zero: " + zeroCount);

        System.out.println(speeds);
        //Remove zeroes to calc an average speed ignoring zeroes
        while (speeds.contains(0.0)) {
            speeds.remove(0.0);
        }
        System.out.println(speeds);

        //Figure out average speed
        double total = 0;
        for (double speed: speeds) {
            total = total + speed;
        }

        double average = total/ speeds.size();
        System.out.println("The average speed is " + average);



    }
}
