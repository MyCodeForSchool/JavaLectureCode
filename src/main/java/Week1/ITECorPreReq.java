package Week1;

import static input.InputUtils.yesNoInput;

public class ITECorPreReq {
    public static void main(String[] args) {
        System.out.println("Check eligibility for a class with OR statements.");
        System.out.println("Please answer the following questions.");

        boolean hasTakenCSharp = yesNoInput ("Have you taken ITEC 2505 C#?");
        boolean hasTakenJava = yesNoInput("Have you taken ITEC 2545 Java?");

    // Use an OR operator in the condition to check if the pre-requisites are met
    if (hasTakenCSharp || hasTakenJava){
        System.out.println("You meet the pre-requisites.   You may take ITEC 2417 Android.");
    } else{
        System.out.println("You do not meet the pre-requisites yet.  You need to take either C# or Java.");
    }
    }
}
