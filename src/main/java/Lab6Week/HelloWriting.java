package Lab6Week;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWriting {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("hello.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write ("Hello\n");
        bufferedWriter.write ("More Stuff\n");
        bufferedWriter.write ("Good Bye!\n");

        bufferedWriter.close(); //don't forget or data will not be saved

        FileWriter writer2 = new FileWriter("hello.txt", true);
        //append flag true means append data to end of file
        BufferedWriter bufferedWriter2 = new BufferedWriter(writer2);

        bufferedWriter2.write("Other data\n");
        bufferedWriter2.write("Hello Programmers\n");
        bufferedWriter2.write("End of File\n");

        bufferedWriter2.close();



    }
}
