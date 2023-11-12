package Lab4Week;

import java.util.Random;

public class RandomNbrs {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(10); //Generate a random # between 0 & 9
        System.out.println("# between 0 & 9: " + randomNumber);

        int anotherRandomNumber = random.nextInt(1000); //gen a random # between 0 & 999
        System.out.println("# between 0 & 999: " + anotherRandomNumber);

        int andAnotherRandomNumber = random.nextInt(10) + 1; //gen a random # between 1 & 10
        System.out.println("# between 1 & 10: " + andAnotherRandomNumber);

        int yesAnotherRandomNumber = random.nextInt(7) + 5; //gen a random # between 5 & 12
        System.out.println("# between 5 & 12: " + yesAnotherRandomNumber);
        //the range is 12-5=7 or 7 possibilities of numbers
        //so gen a random # between 0 & 7 then add 5 to it

    }
}
