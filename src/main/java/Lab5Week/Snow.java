package Lab5Week;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;

public class Snow {
    public static void main(String[] args) {
        Map<String, Double> snowfall = new HashMap<>();
        snowfall.put("January", 3.1);
        snowfall.put("February", 10.8);
        snowfall.put("December", 3.1);
        snowfall.put("March", 4.1);
        snowfall.put("April", 0.0);

        double total = 0;
        for (double snow: snowfall.values()) {
            total+=snow;
        }
        System.out.println("The total snow is " + total + " inches.");

        System.out.println(snowfall);

        for(String month: snowfall.keySet()) {
            double snow = snowfall.get(month);
            System.out.println("The snowfall in " + month + " was " + snow + " inches.");
            System.out.printf("The snowfall in %s was %.2f inches.\n", month, snow);
        }

        snowfall.put("February", 12.4);

        System.out.println(snowfall);

        System.out.println("The snowfall in January is " + snowfall.get("January") + " inches.");

        System.out.println("The snowfall in July is " + snowfall.get("July") + " inches.");

        if (snowfall.containsKey("July")) {
            System.out.println("There was snow in July");
        } else {
            System.out.println("There was no snow in July.");

        }
        String newMonth = stringInput("Enter name of month:");
        double newSnow = positiveDoubleInput("Enter amount of snow for " + newMonth + ":");



        //snowfall.put(newMonth, newSnow);
        System.out.println(snowfall);

        //one way of checking for overwrite when key/values exists
//        if (snowfall.containsKey(newMonth)) {
//            //ask if should overwrite
//            double snow =snowfall.get(newMonth);
//            System.out.println("The hashmap already contains " + newMonth + " snow amount is " + snow + " inches.");
//            boolean overwrite = yesNoInput("Overwrite data?");
//            if (overwrite) {
//                snowfall.put (newMonth, newSnow);
//            } else {
//                System.out.println("Data was not added.");
//            }
//        } else {
//            snowfall.put(newMonth, newSnow);
//        }


        //another way of checking for overwrite
//        boolean overwrite = true;
//
//        if (snowfall.containsKey(newMonth)) {
//            double snow = snowfall.get(newMonth);
//            System.out.println(newMonth + " is already in the HashMap.");
//            System.out.println("Snowfall for " + newMonth + " was " + snow + " inches.");
//            overwrite = yesNoInput("Do you want to overwrite the old data?");
//        }
//
//        if (overwrite) {
//            snowfall.put(newMonth, newSnow);
//        } else {
//            System.out.println("HashMap was not modified.");
//        }
//

        //yet one more way
//        Double snow = snowfall.get(newMonth); //change to nonPrimitive or Object type to allow null value (double vs Double)
//        if (snow != null) {
//            //ask if overwrite
//            System.out.println("The hashmap already contains " + newMonth + ". The snow amount is " + snow + " inches.");
//            boolean overwrite = yesNoInput("Overwrite data?");
//            if (overwrite) {
//                snowfall.put (newMonth, newSnow);
//            } else {
//                System.out.println("Data was not added.");
//            }
//        } else {
//            snowfall.put(newMonth, newSnow);
//        }

        //the last one?
        Double snow = snowfall.get(newMonth); //change to nonPrimitive or Object type to allow null value (double vs Double)
        if (snow == null) {
            snowfall.put(newMonth, newSnow);
        } else {
            //ask if overwrite
            System.out.println("The hashmap already contains " + newMonth + ". The snow amount is " + snow + " inches.");
            boolean overwrite = yesNoInput("Overwrite data?");
            if (overwrite) {
                snowfall.put (newMonth, newSnow);
            } else {
                System.out.println("Data was not added.");
            }
        }

        System.out.println(snowfall);



    }
}
