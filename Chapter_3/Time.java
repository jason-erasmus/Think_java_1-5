import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        int SECONDS_PER_MIN = 60;
        int SECONDS_PER_HOUR = 3600;

        Scanner in = new Scanner(System.in);

        System.out.print("How many seconds? ");
        int secondsInput = in.nextInt();
        int hours = secondsInput / SECONDS_PER_HOUR;
        int remainingSeconds = secondsInput % SECONDS_PER_HOUR;
        int minutes = remainingSeconds / SECONDS_PER_MIN;
        int seconds = remainingSeconds % SECONDS_PER_MIN;

        System.out.printf("%d seconds = %d hours, %d minutes and %d seconds\n", secondsInput, hours, minutes, seconds);

    }
}
