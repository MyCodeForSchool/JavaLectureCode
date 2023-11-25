package Lab6Week;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingNumbers {
    public static void main(String[] args) throws IOException {

        int data1 = 67;
        int data2 = 65;
        int data3 = 84;

        //double number = 12.34;//commented out to work with file on other programs

        FileWriter writer = new FileWriter("numbers.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write(Integer.toString(data1) + "\n");//can do this but it's longer
        //bufferedWriter.write(Integer.toString(data2));//same as above without a new line
        //bufferedWriter.write(data3 + "");//same as below but without a new line
        bufferedWriter.write(Integer.toString(data2) + "\n");//same as above without a new line
        bufferedWriter.write(data3 + "\n");//same as below but without a new line

        //bufferedWriter.write(number + "\n");//commented out to work with file on other programs
        //bufferedWriter.write("test"); //commented out to work with file on other programs

        bufferedWriter.close();


    }
}
