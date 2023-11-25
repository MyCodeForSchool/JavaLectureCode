package Lab6Week;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloReadingTwo {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("numbers.txt"));

            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

            bufferedReader.close();
        } catch (IOException ioe) {
            System.out.println("Sorry, file not found. " + ioe);//only runs if IOException is thrown
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException ioe) {
                    System.out.println("Error closing the file. " + ioe);
                }

            }
        }
    }
}
