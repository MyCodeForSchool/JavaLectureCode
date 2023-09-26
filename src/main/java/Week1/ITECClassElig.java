package Week1;

import static input.InputUtils.yesNoInput;

public class ITECClassElig {
    public static void main(String[] args) {
        System.out.println("This program will check if you meet the pre-requisites for taking ITEC 1250");
        System.out.println("Please answer the follow ing three questions.");

        boolean hasTakenITConcepts=yesNoInput("Have you taken ITEC 1100?");
        boolean hasTakenITSkills=yesNoInput("Have you taken ITEC 1110?");
        boolean hasTakenWindows=yesNoInput("Have you taken ITEC 1250?");

        //Use AND operator to check if all pre-requisites are met.
        if (hasTakenITConcepts && hasTakenITSkills && hasTakenWindows){
            System.out.println("You meet the pre-requisites.  You may take ITEC 1310");
        } else {
            System.out.println("You do not meet the pre-requisites yet.  You need ot complete all three classes.");
        }

    }
}
