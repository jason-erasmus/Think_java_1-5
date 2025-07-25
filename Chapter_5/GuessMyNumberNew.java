package Chapter_5;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumberNew {

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner in = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 1 and 100\r\n" + //
                "(including both). Can you guess what it is?");
        System.out.print("Type your number: ");
        int guess = in.nextInt();

        if (guess == number) {
            System.out.println("Congrats you guessed it! The number was " + number);

        } else if (guess < number) {
            System.out.println("Too low");
        } else {
            System.out.println("Too high!");
        }

        System.out.println("Guess again: ");
        guess = in.nextInt();

        if (guess == number) {
            System.out.println("Congrats you guessed it! The number was " + number);

        } else if (guess < number) {
            System.out.println("Too low");
        } else {
            System.out.println("Too high!");
        }

        System.out.println("Last Chance, guess again: ");
        guess = in.nextInt();

        if (guess == number) {
            System.out.println("Congrats you guessed it! The number was " + number);

        } else {
            System.out.println("Game over!");
        }
        System.out.printf("The number I was thinking of is: %d\n", number);
    }
}
