package Week1;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class BloodDonor {
    public static void main(String[] args) {
        //Testing if two things are ture with AND, the && operator
        //A person can be a blood donor if the
        //they weigh at least 110 lbs AND ar e17 or over

        System.out.println("Waht is your weight?");
        double weight = doubleInput();

        System.out.println("How old are you?");
        int age =intInput();

        if (weight >= 110 && age >= 17){
            System.out.println("You are eligible to be a blood donor.");
        } else {
            System.out.println("Sorry, you are not eligible.");
            if (weight<110){
                System.out.println("You don't weigh enough.  You must weigh 110 lbs or more.");

            }if (age<17){
                System.out.println("You are not old enough.  You must be 17 or older.");
            }
        }
    }
}
