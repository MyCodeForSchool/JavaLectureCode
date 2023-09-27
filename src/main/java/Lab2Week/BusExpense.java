package Lab2Week;

import static input.InputUtils.doubleInput;

public class BusExpense {
    public static void main(String[] args) {
        int numberOfDays = 7;
        double busFare;
        double busFareSum=0.0;

        for (int day =1 ; day <= numberOfDays ; day++){
            busFare = doubleInput ("On day " + day + " of the week, what did you spend on bus fare?");
            busFareSum = busFareSum + busFare;
        }
        System.out.printf("For the week, you spent $%.2f for bus fare.", busFareSum);

    }
}
