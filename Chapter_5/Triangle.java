package Chapter_5;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;

        System.out.println("Enter the length of the sides of a triangle: ");
        try {
            System.out.print("Enter value for A: ");
            a = in.nextDouble();
            if (a <= 0) {
                System.out.println("Error: A cannot be less than or equal to 0");
                return;
            }

            System.out.print("Enter value for B: ");
            b = in.nextDouble();
            if (b <= 0) {
                System.out.println("Error: B cannot be less than or equal to 0");
                return;
            }

            System.out.print("Enter value for C: ");
            c = in.nextDouble();
            if (c <= 0) {
                System.out.println("Error: C cannot be less than or equal to 0");
                return;
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer");
        }

        if ((a + b) < c) {
            System.out.println("Unable to form a triangle as A and B are too short⛔");
        } else if ((a + c) < b) {
            System.out.println("Unable to form a triangle as A and C are too short⛔");
        } else if ((b + c) < a) {
            System.out.println("Unable to form a triangle as B and C are too short⛔");
        } else {
            System.out.println("Congrats you have made a triangle! 📐");
        }
    }
}
