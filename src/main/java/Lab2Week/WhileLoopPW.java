package Lab2Week;

import static input.InputUtils.stringInput;

public class WhileLoopPW {
    public static void main(String[] args) {
        String secretPW = "kittens";

        System.out.println();
        String userPW = stringInput("Enter the password:");

        int maxGuesses = 5;

        while (! userPW.equals(secretPW) && maxGuesses > 1){
            // the pw is wrong - print error msg
            System.out.println("Password incorrect, access denied!");
            //Ask them to try again.
            System.out.println("Try again!");
            //Replace userPW with the next attempt
            userPW = stringInput("Enter the password:");
            //if the user gets it wrong again, the loop will repeat.
            maxGuesses--;
        }

        if (maxGuesses > 1){
            System.out.println("Correct Password - Access Granted");
        }else {
            System.out.println("Max number of password attempts.");
        }
        //if the loop condition is false, then the user got the password right.
        //print 'access granted method.

    }
}
