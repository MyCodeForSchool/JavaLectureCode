package Lab4Week;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Trees {
    public static void main(String[] args) {
        //List<String> trees= new ArrayList<>(); //create ArrayList
        //List<String> trees= new LinkedList<>();//create LinkedList
        List<String> trees= new Vector<>();//create Vector
        //can use exact same code for all three list

        trees.add("Pine");//adds data to end of the ArrayList
        trees.add("Oak");
        trees.add("Elm");
        trees.add("Aspen");

        trees.add(2, "Palm");//adds data at index 2 in the ArrayList

        System.out.println("Tree at index 1 is " + trees.get(1) );//get by index

        for (String tree: trees) {
            System.out.println(tree);
        }

        trees.remove("Oak");//remove by value
        trees.remove(0); //remove by index

        System.out.println(trees);

        if (trees.contains("Aspen")){
            System.out.println("Tree list contains Aspen");
        }

        int numberOfTrees = trees.size();
        System.out.println("There are " + numberOfTrees + " trees in the list.");



    }
}
