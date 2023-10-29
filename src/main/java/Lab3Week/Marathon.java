package Lab3Week;

public class Marathon {
    public static void main(String[] args) {

        double currentDistance = 1;
        double targetDistance = 26.2;
        double percentIncrease = 1.10;

        marathonSchedule(currentDistance, targetDistance, percentIncrease);
    }
        public static void marathonSchedule(double currentDist, double targetDist, double pctInc){

        int week = 1;
        //loop until the current distance is greater than the target distance
        while (currentDist < targetDist) {
            System.out.println(week + " " +currentDist);
            currentDist = currentDist * pctInc;
            week++; //count the number of weeks
        }
        //the loop runs until the condition is met & since the sout is part of the loop
        // it isn't printing the last value & we add a sout after the loop to see that one
        System.out.println(week + " " +currentDist);
        }
//        double value=1;
//        value=value*1.1;
//        System.out.println();

    }
