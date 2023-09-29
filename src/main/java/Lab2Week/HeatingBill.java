package Lab2Week;

import java.util.Arrays;

import static input.InputUtils.*;

public class HeatingBill {
    public static void main(String[] args) {
        //create an array with months - done
        String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        //create an array to store bill amounts
        Double[] billAmts= new Double[12];
        //create a variable to sum bill amounts
        double heatingBillSum= 0;
        //create a for loop to gather bill amounts for each month
        for (int month = 0; month < monthNames.length; month++) {
            String monthName = monthNames[month];
            double monthbillAmt = positiveDoubleInput("Please enter the amount of your bill for " + monthName + ":");
            billAmts[month] = monthbillAmt;
           heatingBillSum=heatingBillSum + monthbillAmt;
        }
        //find the average of the bill amounts
        double average = heatingBillSum / monthNames.length;
        //print pretty table with month and amount entered
        System.out.printf("The total amount spent for the year was $%.2f.\n",heatingBillSum);
        System.out.printf("The average amount spent per month was $%.2f.\n", average);
        //System.out.println(Arrays.toString(billAmts));
        for (int month=0 ; month < monthNames.length ; month++) {
            //System.out.println("For " + monthNames[month] + " the amount you paid is " + billAmts[month] + ",");
            System.out.printf("For %s the amount you paid is $%.2f.\n",monthNames[month], billAmts[month]);
        }



    }
}