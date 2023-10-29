package Lab3Week;

import static input.InputUtils.doubleInput;

public class MPG {
    public static void main(String[] args) {

        double miles=doubleInput("Enter # of miles driven:");
        double gasUsed=doubleInput("Enter gallons of gas used:");

        double mpg = milesPerGallon(miles, gasUsed);
        //create variable, call method, send arguments for method to use

        System.out.println("The MPG for this journey is " + mpg + " miles per gallon.");

    }

    public static double milesPerGallon (double miles, double gallons){
        double mpg = miles / gallons;
        return mpg;
    }
}
