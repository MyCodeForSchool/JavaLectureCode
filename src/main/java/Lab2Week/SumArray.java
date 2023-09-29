package Lab2Week;

public class SumArray {
    public static void main(String[] args) {
        double numbers[]= new double [3];

        //Add some example data
        numbers[0]= 45.234256;
        numbers[1]=-123945.22;
        numbers[2]=0.0000003;

        //when adding up data, need a start point - adding up all the values starts at 0.

        double sum = 0;


        //loop over the array, and add each value to hte sum variable
        for (int x = 0; x < numbers.length; x++){
            sum = sum + numbers[x];
        }
        double average = sum / numbers.length;
        System.out.println("Total of numbers = " + sum);
        System.out.println("and the average of these numbers is" + average);
    }
}
