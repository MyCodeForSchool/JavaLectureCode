package Lab3Week;

import static input.InputUtils.doubleInput;

public class LemonadeStand {
    public static void main(String[] args) {

        double lemonadeProfit = calcProfitForProduct("lemonade");
        System.out.println("Lemonade profit is $" + lemonadeProfit);

        double cookieProfit = calcProfitForProduct("cookie");
        System.out.println("Cookie profit is $" + cookieProfit);

        double coffeeProfit = calcProfitForProduct ("coffee");
        System.out.println("Coffee profit is $" + coffeeProfit);
    }

    public static double calcProfitForProduct(String productName) {
        double suppliesCost = doubleInput("How much did you spend on " + productName + " supplies?");
        double salePrice = doubleInput("What did you sell one " + productName + " for?");
        double unitsSold = doubleInput("How many " + productName + " did you sell?");

        //calculate profit
        double profit = (unitsSold * salePrice) - suppliesCost;
        return profit;

    }
}
