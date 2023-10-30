package Lab4Week;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class AddingList {
    public static void main(String[] args) {
        List<Integer> classCodes = new ArrayList<>();
        classCodes.add(2545);
        classCodes.add(1150);
        classCodes.add(1250);

        classCodes.add(0, 1425);
        classCodes.add(2, 1100);

        System.out.println(classCodes);
        System.out.println(classCodes.size());

        for (int classCode: classCodes) {
            System.out.println("ITEC " + classCode);
        }

        classCodes.add(1110);

        System.out.println("First code " + classCodes.get(0));
        System.out.println("4th code " + classCodes.get(3));
        System.out.println("Last code " + classCodes.get(classCodes.size() - 1));

        System.out.println(classCodes);
        classCodes.remove (Integer.valueOf(1250));
        System.out.println(classCodes);


    }
}
