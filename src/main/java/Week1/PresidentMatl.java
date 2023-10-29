package Week1;

import static input.InputUtils.positiveIntInput;
import static input.InputUtils.yesNoInput;

public class PresidentMatl {
    public static void main(String[] args) {
        System.out.println("Are you eligible to become the President?");
        System.out.println("Please answer these three questions.");

        boolean naturalBornCitizen = yesNoInput("Were you born in the United States?");
        int age =positiveIntInput("What is your age, in years?");
        int yearsLivedInUS = positiveIntInput("How many years have you lived in the US?");

        if (naturalBornCitizen && age >=35 && yearsLivedInUS > 14){
            System.out.println("You meeet the eligibility requirements to become president.  Good Luck!");
        }else {
            System.out.println("Sorry, you do not meet the requirements.");
        }



    }
}
