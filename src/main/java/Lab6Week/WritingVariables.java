package Lab6Week;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingVariables {
    public static void main(String[] args) throws IOException {

        int classCode = 2545;
        double averageEnrollment = 22.16;
        String className = "Java";

        FileWriter writer = new FileWriter("java.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("The class code is " + classCode + "\n");
        bufferedWriter.write("The class name is " + className + "\n");
        bufferedWriter.write("The average enrollment is " + averageEnrollment + " students.\n");

        bufferedWriter.close();//you can do this to close the writer
        //writer.close(); //or you can do this - either works

    }
}
