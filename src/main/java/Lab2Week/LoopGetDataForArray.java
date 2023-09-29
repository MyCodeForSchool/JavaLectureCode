package Lab2Week;

import java.util.Arrays;

import static input.InputUtils.stringInput;

public class LoopGetDataForArray {
    public static void main(String[] args) {

        //create an array to store 5 strings
        String[] textbooks = new String[5];

        //Loop 5 times using the loop counter variable "number" to start the count from 0
        for (int number=0; number < textbooks.length ; number++) {
            //Have user input book data
            String bookName = stringInput("Please enter name of textbook:");
            //using the loop counter to write to each array element in turn
            textbooks[number] = bookName;
        }
        System.out.println("Thank you.  Here is what you entered.");
        System.out.println(Arrays.toString(textbooks));

        for (int number=0; number< textbooks.length; number++){
            System.out.println(textbooks[number]);
        }
        for (int number=0 ; number <textbooks.length ; number++){
            System.out.println("Book number " + (number+1) + " is "+ textbooks[number] + ",");
        }
    }

}
