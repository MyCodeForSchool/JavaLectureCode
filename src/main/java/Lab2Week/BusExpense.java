package Lab2Week;

import static input.InputUtils.doubleInput;

public class BusExpense {
    public static void main(String[] args) {
        //an array with days to create more descriptive questions for the user
        String[] dayNames ={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        double busFareSum = 0; //add each day's expense to this variable to calc the total

        for (int day =0; day < dayNames.length ; day++){ //loop 7 times
            String dayName= dayNames[day];
            double dayExpense = doubleInput ("On " + dayName + " what did you spend on bus farea?");
            busFareSum = busFareSum + dayExpense;
        }
        System.out.printf("For the week, you spent $%.2f for bus fare.", busFareSum);

    }
}
