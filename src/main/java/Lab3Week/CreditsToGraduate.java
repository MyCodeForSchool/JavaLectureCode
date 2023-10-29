package Lab3Week;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class CreditsToGraduate {
    public static void main(String[] args) {
        int creditsNeeded = intInput("How many credits does your program require?");
        int creditsEarned = intInput("How many credits do you have?");
        int creditsRemaining= howManyCreditsToGraduate(creditsNeeded, creditsEarned);
        System.out.println("You have " + creditsRemaining + " credits left to earn before graduating.");
    }

    public static int howManyCreditsToGraduate (int CrdNeeded, int CrdEarned){
        int creditsLeft = CrdNeeded - CrdEarned;
        return creditsLeft;
    }
}
