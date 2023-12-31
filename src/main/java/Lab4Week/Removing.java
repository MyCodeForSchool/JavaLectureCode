package Lab4Week;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Removing {
    public static void main(String[] args) {

        List<String> classNames = new ArrayList<>();
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");


        //enhanced for loop; use when not modifying the data
        for (String name: classNames) {
            System.out.println(name);

        }

        System.out.println();


        //classic for loop; contains index if needed as well as data
        for (int i = 0; i < classNames.size(); i++) {
             System.out.println(classNames.get(i));
        }

//        for (int i = 0; i < classNames.size(); i++) {
//            System.out.println(classNames.get(i));
//            classNames.remove(0); //doesn't error but doesn't do what i want it do do either
//        }
        //this code causes the list to be zeroed out
//        System.out.println();
//        while (!classNames.isEmpty()) { //while classNames is not empty
//            String name = classNames.remove(0);
//            System.out.println(name);
//        }

//        classCodes.remove (2);//defaults to index of 2
//        classCodes.remove (Integer.valueOf(1250));  //use this to remove an int

        System.out.println(classNames);

        classNames.remove("Project Management"); //object
        System.out.println(classNames);
        boolean wasRemoved = classNames.remove ("Lalala");
        System.out.println(classNames + " " + wasRemoved);

        System.out.println(classNames);

        classNames.remove(0); //int primitive type - index are primitve
        System.out.println(classNames);

        classNames.set (0, "Systems Analysis");
        System.out.println(classNames);

        String search = "Systems Analysis";
        if (classNames.contains(search)) {
            System.out.println("The list does contain " + search);
        } else {
            System.out.println("The list does NOT contain " + search);
        }

        System.out.println(classNames.size());

//        classNames.clear();
//        System.out.println(classNames);
//        System.out.println(classNames.size());
//        System.out.println(classNames.isEmpty());

        Collections.sort(classNames);
        System.out.println(classNames);

    }
}
