package Lab6Week;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadNumberFromFile {
    public static void main(String[] args) throws IOException {

        List<Integer> numbers = new ArrayList<>();
        String filename = "numbers.txt";

        BufferedReader reader = new BufferedReader(new FileReader(filename));

        String line = reader.readLine();

        while (line != null) {
            //ignore anything that isn't an integer
            try {
                int number = Integer.parseInt(line);
                numbers.add(number);
            } catch (NumberFormatException e) {
                //ignore
                System.out.println( line + " is not an integer, ignoring.");
            }
            line = reader.readLine();
            //need this or prog runs without doing anything & throws out of memory heap space
        }
        System.out.println(numbers);
    }
}
