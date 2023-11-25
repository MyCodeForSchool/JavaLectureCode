package Lab6Week;

import static input.InputUtils.intInput;

public class UserEntersData {
    public static void main(String[] args) {

        //Example: you want user to enter a number between 1 and 10

        int userInput = 0;
        while (userInput < 1 || userInput > 10) {
            userInput = intInput("Please enter a number between 1 and 10");
        }
        System.out.println("Thanks!  The number you entered is " + userInput);

        int userInput2;
        do {
            userInput2 = intInput("Please enter a number between 1 and 10");
        } while (userInput2 < 1 || userInput2 > 10);
        System.out.println("Thanks!  The second number you entered is " + userInput2);


    }
}
