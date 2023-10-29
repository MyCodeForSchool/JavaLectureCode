package Lab3Week;

import static input.InputUtils.intInput;

public class Count {
    public static void main(String[] args) {

        //print a list of numbers in order
        int smallNumber = intInput("Enter a small number:");
        int largeNumber = intInput ("Enter a large number:");

        System.out.println("I will count from " + smallNumber + " to " + largeNumber);

        count (smallNumber, largeNumber);
    }
//method that doesn't return anything=return type void
public static void count(int min, int max){
        for (int i = min; i <= max; i++){
            System.out.println(i);
        }
}

}
