package Chapter_5;

import java.util.Scanner;

public class Femat {

    public static double theorem(double a, double b, double c, double n) {

        if (n > 2 && (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n))) {
            System.out.println("“Holy smokes, Fermat was wrong!”");
        } else {
            System.out.println("No, that doesn\'t work.");
        }
        return 0.0;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("We are going to test Femat\'s last theorem.");
        System.out.println("In put 3 integers for a, b, c and n");
        System.out.print("a: ");
        double a = in.nextDouble();
        System.out.print("b: ");
        double b = in.nextDouble();
        System.out.print("c: ");
        double c = in.nextDouble();
        System.out.print("n: ");
        double n = in.nextDouble();

        theorem(a, b, c, n);

    }
}
