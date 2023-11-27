package Lab3Week;

import static input.InputUtils.*;
//
//public class Tires {
//    public static void main(String[] args) {
//
//        int numberOfTires = positiveIntInput("Enter number of tires to compare.");
//
//        String[] tireReports = new String[numberOfTires];
//
//        for (int t = 0 ; t < numberOfTires ; t++) {
//            String report = getTireData();
////            System.out.println(report);
//            tireReports[t] = report;
//        }
//    //    printReportTable(tireReports);
//    }
//
//    private static void printReportTable(String[] tireReports) {
//        for (int t = 0; t < tireReports.length; t++) {
//            System.out.println(tireReports[t]);
//        }
//    }
//    public static String getTireData(){
//        String tireName = stringInput("Enter name of tire:");
//        double price = doubleInput(" Enter price for " + tireName);
//        double miles = doubleInput(" Enter warranty miles for " + tireName);
//        double pricePerThousMiles = price / miles * 1000;
//        return "The " + tireName + " tire costs $" + pricePerThousMiles + " dollars per thousand miles.";
//    }
//}
