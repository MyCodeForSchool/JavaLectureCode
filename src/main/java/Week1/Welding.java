package Week1;

import static input.InputUtils.yesNoInput;

public class Welding {
    public static void main(String[] args) {
        //For welding class you must wear cotton or wool clothes
        //And you must wear closed toe shoes.
        //This program checks if a student is dressed for welding class.

        boolean cottonClothes = yesNoInput("Are you wearing cotton clothes?");
        boolean woolClothes = yesNoInput("Are you wearing wool clothes?");
        boolean closedToeShoes = yesNoInput("Are you wearing closed-toe shoes?");

        //TODO write an if statement to check if the student is safely dressed

    if ( (cottonClothes || woolClothes) && closedToeShoes){
        System.out.println("You are dressed safely.");
    }else {
        System.out.println("You must wear cotton or wool clothes and closed-toe shoes.");
    }
    }
}
