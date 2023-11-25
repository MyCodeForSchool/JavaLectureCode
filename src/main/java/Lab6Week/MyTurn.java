package Lab6Week;

import java.io.*;

public class MyTurn {
    public static void main(String[] args) throws IOException {

        String fileName = "myTurn.txt";
        String name = "Liz Rice";
        String faveColor = "Cobalt Blue";
        int classCode = 2545;

        FileWriter writer = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write("My name is " + name + ".\n");
        bufferedWriter.write("My favorite color is " + faveColor + ".\n");
        bufferedWriter.write("The class code for this class is " + classCode + ".\n");

        bufferedWriter.close();

        FileReader reader = new FileReader (fileName);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line = bufferedReader.readLine();

        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
    }
}
