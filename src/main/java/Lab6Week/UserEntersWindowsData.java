package Lab6Week;

import java.util.List;

import static input.InputUtils.stringInput;

public class UserEntersWindowsData {
    public static void main(String[] args) {
        List<String> windowsVersions = List.of("XP", "7", "8", "10");
        String windowsVersionsString = String.join(", ", windowsVersions);//makes "XP, 7,8,10" String

        String version = stringInput("Enter your version of Windows from these choices: "
                + windowsVersionsString).toUpperCase();

        while (!windowsVersions.contains(version)) {
            version = stringInput("Not a recognized version. "
                    + "Enter your version of Windows from these choices: "
                    + windowsVersionsString).toUpperCase();
        }
        System.out.println("Thanks! Your windows version is " + version);
    }
}
