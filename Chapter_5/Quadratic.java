import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;

        System.out.println("enter numbers for the equation: ");
        try {
            System.out.print("Enter value for a: ");
            a = in.nextDouble();
            if (a == 0) {
                System.out.println("Error: a cannot = 0");
                return;
            }

            System.out.print("Enter value for b: ");
            b = in.nextDouble();
            if (b == 0) {
                System.out.println("Error: b cannot = 0");
                return;
            }

            System.out.print("Enter value for c: ");
            c = in.nextDouble();
            if (c == 0) {
                System.out.println("Error: c cannot = 0");
                return;
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer");
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double solutionOne = (-b + Math.sqrt(discriminant) / (2 * a));
            double solutionTwo = (-b - Math.sqrt(discriminant) / (2 * a));
            System.out.println("The two solutions for root are: " + solutionOne + " and " + solutionTwo);
        } else if (discriminant == 0) {
            double solution = -b / (2 * a);
            System.out.println("There is only one soluton for root: " + solution);
        } else {
            System.out.println("There are no valid solutions");
        }

    }

}