package Lab5Week;

import java.util.HashMap;
import java.util.Map;

public class ClassCodes {
    public static void main(String[] args) {
        Map<Integer, String>  classInfo= new HashMap<>();
        classInfo.put (2545, "Java");
        classInfo.put (1425, "Datacom");
        classInfo.put (2560, "Web");

        for (Integer classNbr: classInfo.keySet()) {
            String classDesc = classInfo.get(classNbr);
            System.out.println("ITEC " + classNbr + " " + classDesc);

        }
        System.out.println("There are " + classInfo.size() + " classes.");

        int searchCode = 2417;


        if (classInfo.containsKey(searchCode)) {
            System.out.println("This class is found in the HashMap.  The class name is " +
                    classInfo.get(searchCode));
        } else {
            System.out.println( searchCode + " not found.");
        }


       int searchCode2 = 2545;
       String className = classInfo.get(searchCode2);
       if (className == null) {
           System.out.println(searchCode2 + " Not Found");
       } else {
           System.out.println("Class code " + searchCode2 + " is for " + className);
       }
    }
}
