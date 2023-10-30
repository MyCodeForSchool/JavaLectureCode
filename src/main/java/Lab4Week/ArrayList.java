package Lab4Week;

import java.util.List;

import static input.InputUtils.stringInput;

public class ArrayList {
    public static void main(String[] args) {

        List<String> todoList = new java.util.ArrayList<>();

        while (true) {
            String data = stringInput("Type a task you need to do, or Enter to quit.");
//            if (data.length() == 0) { //if the user just presses Enter, the length of the text is 0
           if (data.isEmpty()) {
                break;
            }
           if (containsIgnoresCase(todoList, data)){
               System.out.println("You already added that!");
           }else {
               todoList.add(data);
           }
        }
        System.out.println("Thank you, your tasks are:");

        for (String input : todoList) {
            System.out.println(input);
        }
        System.out.println("You have " + todoList.size() + " tasks to do." );
    }

    public static boolean containsIgnoresCase(List<String> list, String data) {
        for (String item: list) {
            if (item.equalsIgnoreCase(data)) {
                return true;
            }
        }
        return false;
    }
}
