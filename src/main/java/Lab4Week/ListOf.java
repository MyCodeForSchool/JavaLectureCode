package Lab4Week;

import java.util.List;

public class ListOf {
    public static void main(String[] args) {
        List<String> animals = List.of("Cat", "Bird", "Zebra");
        System.out.println(animals);
        //animals.add("Frog"); //these will error out as you can't modify a LiftoOf List
        //animals.remove("Frog"); //these will error out as you can't modify a LiftoOf List
    }
}
