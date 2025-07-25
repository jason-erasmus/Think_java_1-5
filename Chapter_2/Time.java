package Chapter_2;
public class Time {

    public static void main(String[] args) {
        int SECONDS = 60;
        int MINUTE = 60;
        double SECONDS_IN_A_DAY = 86400.00;

        int hourNow = 21;
        int minuteNow = 31;
        int secondNow = 28;
        int hourDone = 21;
        int minuteDone = 48;
        int secondDone = 56;

        int timePassed = ((hourNow * MINUTE) * SECONDS) + (minuteNow * SECONDS) + secondNow;
        int timeLeft = ((24 * MINUTE) * SECONDS) - (((hourNow * MINUTE) * SECONDS) + (minuteNow * SECONDS) + secondNow);
        double percentPassed = timePassed / SECONDS_IN_A_DAY * 100.00;
        int timeStarted = timePassed;
        int timeFinished = ((hourDone * MINUTE) * SECONDS) + (minuteDone * SECONDS) + secondDone;

        System.out.println("Seconds since Midnight: " + timePassed);
        System.out.println("Time left until Midnight: " + timeLeft);
        System.out.println("Percentage of time passed: " + percentPassed);
        System.out.println("This task has taken me: " + ((timeFinished - timeStarted) / 60.0) + " minutes!");
    }

}
