package Chapter_3;

import java.util.Scanner;

public class Convert {

    public static void main(String[] args) {
        double celcius;

        Scanner in = new Scanner(System.in);
        System.out.print("How many degrees celcius? ");
        celcius = in.nextDouble();
        double C_TO_F = (celcius * (9.0 / 5.0)) + 32;
        System.out.printf("%.2f C = %.2f F \n", celcius, C_TO_F);
    }

}
