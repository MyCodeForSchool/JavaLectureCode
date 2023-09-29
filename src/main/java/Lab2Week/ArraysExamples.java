package Lab2Week;

import java.util.Arrays;

public class ArraysExamples {
    //Create a string array, initialized with data.
    //did this instead of classes since I'm only taking one class
    public static void main(String[] args) {
        String[] classrooms = {"T3010", "T3020", "T3030", "T3040", "T3050","T3080","T3090"};
    // use a loop to print all of the data from the array
    //notice how the loop counter is used
    //for (int x=0; x<6; x++) {
    //System.out.println(classrooms[x]);

        for (int x=0; x< classrooms.length; x++) {
            System.out.println(classrooms[x]);
        }

        System.out.println(Arrays.toString(classrooms));

    }
}
