package Lab5Week;

import java.util.HashMap;
import java.util.Map;

public class States {
    public static void main(String[] args) {
        Map<String, String> stateAbbrev = new HashMap<>();
        stateAbbrev.put ("Minnesota", "MN");
        stateAbbrev.put ("Iowa", "IA");
        stateAbbrev.put ("Michigan", "MI");
        System.out.println(stateAbbrev);

        System.out.println(stateAbbrev.get("Iowa"));

        System.out.println(stateAbbrev.get("Wisconsin"));

        String iowaAbbrev = stateAbbrev.get("Iowa");
        System.out.println(iowaAbbrev);
        System.out.println("Now to look up a key using a value");

        // how to look up a key with the value;
        // one way is to loop over each pair until you find the value you are looking for and return the key
        // one way is to create a new hashmap reversing the roles of key/value

        System.out.println("This will loop over the keys and give you the values.");
        for (String stateName: stateAbbrev.keySet()){
            System.out.println(stateName);
            System.out.println(stateAbbrev.get(stateName));
        }

        System.out.println("This will loop over the values and give your the abbreviations but not the key.");
        for (String abbrev: stateAbbrev.values()) {
            System.out.println(abbrev);
        }


        System.out.println("Added a variable to use in the if statement logic, " +
                "This will loop over the keys and give you the values.");
        String searchAbbrev = "MI";
        for (String stateName: stateAbbrev.keySet()) {
            System.out.println(stateName);
            System.out.println(stateAbbrev.get(stateName));
            String abbrev = stateAbbrev.get(stateName);
            if (abbrev.equals(searchAbbrev)) {
                System.out.println("Found it! The state for " + searchAbbrev + " is " + stateName);
            } else {
                System.out.println("I did not find it!");
            }
        }
        System.out.println("Here is another way by creating a new hashmap.");
        Map <String, String> abbrevStateName = new HashMap<>();
        for (Map.Entry<String, String> entry : stateAbbrev.entrySet()) {
            String state = entry.getKey();
            String abbrev = entry.getValue();
            abbrevStateName.put(abbrev, state);
        }
        System.out.println(abbrevStateName);
        System.out.println(stateAbbrev);

        System.out.println("There are " + stateAbbrev.size() + " states listed.");
    }
}
