package Lab2Week;

import static input.InputUtils.doubleInput;
import static input.InputUtils.yesNoInput;

public class SalesTaxWhileLoop {
    public static void main(String[] args) {

        boolean moreCalcs = true;
        double price;
        double salesTax = 1.07;

        //This loop repeats as long as the user wants to do more calcs.
        while (moreCalcs){
            price = doubleInput("Type in a price:");
            double priceInclTax = price * salesTax;
            System.out.printf("The price plus sales tax is $%.2f.\n", priceInclTax);

            //to decide if the loop should repeat, ask if want to continue
            //uses moreCalcs in the while loop condition
            moreCalcs = yesNoInput("Do you want to continue?");
        }
        System.out.println("Thanks for using the program - goodbye!");
    }
}
