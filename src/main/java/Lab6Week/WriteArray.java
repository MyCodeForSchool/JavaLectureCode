package Lab6Week;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteArray {
    public static void main(String[] args) throws IOException {

        String[] months = {"Jan", "Feb", "Mar"};

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("months.txt"));

        for (String month: months) {
            bufferedWriter.write(month + "\n");
//            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
