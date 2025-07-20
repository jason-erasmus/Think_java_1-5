import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner in = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 1 and 100\r\n" + //
                "(including both). Can you guess what it is?");
        System.out.print("Type your number: ");
        int guess = in.nextInt();
        System.out.printf("Your guess is: %d\n", guess);
        System.out.printf("The number is was thinking of is: %d\n", number);
        int diff = number - guess;
        System.out.printf("You were off by: %d\n", diff);

    }
}
