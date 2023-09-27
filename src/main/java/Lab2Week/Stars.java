package Lab2Week;

import static input.InputUtils.positiveIntInput;

public class Stars {
    public static void main(String[] args) {
        // Display a square of *
        int size = positiveIntInput("Enter size of square.");

        //the outer loop prints one row per loop repeat
        for (int x = 0 ; x < size ;x++) {

            //Inner for loop, for each row print a star 5 times
            for (int y = 0; y < size ; y++){
                //Notice system.out.print - not ln.  This NOT adds new line
                //at the end of the output so all starts on one line.
                System.out.print("*");
            }
            //and then move to the next line
            System.out.println();
        }

    }
}
