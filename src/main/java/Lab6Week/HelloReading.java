package Lab6Week;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class HelloReading {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("hello.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        //Another way to write the same code as above
        //BufferedReader bufferedReader = new BufferedReader(new FileReader("hello.txt"));


        //System.out.println(bufferedReader.readLine());
        // could do this a bunch of times; not efficient; so we use a while loop

        String line = bufferedReader.readLine();

        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }

        //Can shorten the while loop as well; but might not be as readable
//        String line2;
//        while ( (line2 = bufferedReader.readLine()) != null) {
//            System.out.println(line2);
//            line2 = bufferedReader.readLine();
//        }

        bufferedReader.close();

    }
}
