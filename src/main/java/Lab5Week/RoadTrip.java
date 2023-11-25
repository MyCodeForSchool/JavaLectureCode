package Lab5Week;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static input.InputUtils.intInput;
import static input.InputUtils.positiveIntInput;

public class RoadTrip {
    public static void main(String[] args) {
        Map<String, Integer> cityDists = new HashMap<>();
        cityDists.put ("Duluth", 154);
        cityDists.put ("Brainerd", 127);
        cityDists.put ("Stillwater", 26);
        cityDists.put ("Ely", 245);
        cityDists.put ("Red Wing", 54);

int milesToGo = positiveIntInput("Enter the maximum distance you want to drive on your road trip:");

List<String> citiesInRange = new ArrayList<>();

for (String cityName: cityDists.keySet()) {
    Integer milesToCity = cityDists.get(cityName);
//    System.out.println(cityName + " " + milesToCity);
    if (milesToCity <= milesToGo) {
//        System.out.println(cityName + " " + milesToCity);
        citiesInRange.add(cityName);
    }
}

if (citiesInRange.isEmpty()) {
            System.out.println("Sorry no Minnesota cities are within your driving distance.");
        } else {
            System.out.println("Here is the list of cities you can drive to.  There are " + citiesInRange.size() + ".");
            for (String city: citiesInRange){
                System.out.println(city);
            }
        }
    }
}
