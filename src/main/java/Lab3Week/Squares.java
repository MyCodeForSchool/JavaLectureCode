package Lab3Week;

import static input.InputUtils.doubleInput;

public class Squares {
    public static void main(String[] args) {
//      double number = doubleInput("Please enter a number and I'll square it:");
//      double squared = square(number);
//      System.out.println("The square of " + number + " is " + squared);

        for (int x=1 ; x <= 10 ; x++){
            double s = square (x);
            System.out.println("The square of " + x + " is " + s);
        }



    } //this is the end of our main method

    //this method takes one argument, a number & calcs the square
    //then it prints the result

    public static double square(double n) {
        double sq = n * n;
        return sq;
    }//the end of the square method
}