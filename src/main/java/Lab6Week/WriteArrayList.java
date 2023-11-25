package Lab6Week;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteArrayList {
    public static void main(String[] args) throws IOException {

        final String filename = "ITEC_Classes.txt";
        //Write lines to the file "ITEC 2545 Java" and "ITEC 2560 Web", etc.
        List<String> classNames = List.of("Java", "Web", "C#");

        List<Integer> classCodes = List.of (2545, 2560, 2505);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));

        for (int i=0; i < classNames.size(); i++) {
            String name = classNames.get(i);
            int code = classCodes.get(i);
            bufferedWriter.write("ITEC " + code + " " + name + ".\n");//unformatted
            bufferedWriter.write(String.format("ITEC %d %s. \n",code,name));//formatted
            String outputLine = String.format("ITEC %d %s. \n",code,name);//another option
            bufferedWriter.write(outputLine);//goes with another option
        }
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        List <String> classDesc = new ArrayList<>();
        String line = bufferedReader.readLine();
        while (line != null) {
            classDesc.add(line);
            line = bufferedReader.readLine();
        }

        System.out.println("End of File Reached!");
        System.out.println(classDesc);


    }
}
