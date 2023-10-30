package Lab4Week;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalCollections {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Pig");
        animals.add("Horse");
        animals.add("Fish");
        animals.add("Bird");
        animals.add("Fish");

        System.out.println("original Animals list" + animals);

        Collections.sort(animals); //sort into order if data is sortable
        System.out.println("Sorted animals list: " + animals);

        Collections.replaceAll(animals, "Fish", "Shark");
        System.out.println("Replaced Fish with Shark list: " + animals);

        Collections.reverse(animals); //reverse order of the list
        System.out.println("Reverse order :" + animals);



        Collections.shuffle(animals); //put elements in random order
        System.out.println("Shuffled: " + animals);

        System.out.println("Min=First alpha/Lowest numeric: " + Collections.min(animals));
        System.out.println("Max=Last alpha/highest Numeric: " + Collections.max(animals));

        Collections.fill(animals, "Koala");
        System.out.println("Replaced every item in list: " + animals);


    }
}
