package Week1;

import static input.InputUtils.positiveDoubleInput;

public class MilestoMCTC {
    public static void main(String[] args) {
        double miles = positiveDoubleInput("How many miles from your house to MCTC?");
        double km = miles * 1.6;
        System.out.println("You live " + km + " kilometers from school.");

        if (miles>10){
            System.out.println("You live more than 10 miles from MCTC.");
        }
    }
}
