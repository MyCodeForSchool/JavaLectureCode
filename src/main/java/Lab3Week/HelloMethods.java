package Lab3Week;

import static input.InputUtils.stringInput;

public class HelloMethods {
    //this is the main method - the first code run
    public static void main(String[] args) {
        String name = stringInput("Please enter your name:");
        String greeting = makeGreeting(name);
        System.out.println(greeting);

    }//this is the end of the main method

//This is a new method which takes one argument, a String
// It will create a new string, using Hello, the argument that was passed, and !
// return that new String to the main method

public static String makeGreeting(String n) {
        String greeting = "Hello " + n + "!";
        return greeting;
}//end of makeGreeting method


} //end of HelloMethods class
