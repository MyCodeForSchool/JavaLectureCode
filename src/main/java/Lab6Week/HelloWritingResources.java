package Lab6Week;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWritingResources {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("hello.txt"))) {
            bufferedWriter.write("Hello\n");
            bufferedWriter.write("More Stuff\n");
            bufferedWriter.write("Good Bye!\n");

//            bufferedWriter.close(); don't need these with try with resources
        } catch (IOException ioe) {
            System.out.println("Error writing to file " + ioe);
        }
//append flag true means append data to end of file
        try (FileWriter writer2 = new FileWriter("hello.txt", true);
             BufferedWriter bufferedWriter2 = new BufferedWriter(writer2) ) {
            bufferedWriter2.write("Other data\n");
            bufferedWriter2.write("Hello Programmers\n");
            bufferedWriter2.write("End of File\n");

//            bufferedWriter2.close(); don't need these with try with resources
        } catch (IOException ioe) {
            System.out.println("Error appending data to file " + ioe);
        }



    }
}
