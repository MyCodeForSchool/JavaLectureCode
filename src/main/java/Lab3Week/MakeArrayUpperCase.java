package Lab3Week;

import java.util.Arrays;

public class MakeArrayUpperCase {
    public static void main(String[] args) {
        String[] sponsors = {"ikea", "at&t", "cvs", "3m"};
        makeArrayUppercase(sponsors);
        System.out.println(Arrays.toString(sponsors));

    }

    public static void makeArrayUppercase (String[] array) {
        for (int a = 0; a < array.length; a++){
            array[a]=array[a].toUpperCase();
        }
    }
}
