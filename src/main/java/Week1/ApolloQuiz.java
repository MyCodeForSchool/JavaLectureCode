package Week1;

import static input.InputUtils.intInput;

public class ApolloQuiz {
    public static void main(String[] args) {
        System.out.println("Quiz Time!");
        System.out.println("What year did Apollo 11 land on the moon?");

        int answer = intInput();

        //== equal to
        // > greater than
        // >= greater than or equal to
        // < less than
        // <= less than or equal to
        //!= not equal to

        //This condition tests if the answer is not equal to 1969.
        if (answer != 1969) {
            System.out.println("Wrong answer - it was 1969!");
        }

    }
}
