package Chapter_5;

public class Logic {
    public static void main(String[] args) {

        boolean yes = true;
        boolean no = false;
        int loVal = -999;
        int hiVal = 999;
        double grade = 87.5;
        double amount = 50.0;
        String hello = "world";

        if (yes == no || grade > amount) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // Error
        // if (amount == 40.0 || 50.0) {
        // System.out.println("true");
        // } else {
        // System.out.println("false");
        // }

        if (hiVal != loVal || loVal < 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // Error
        // if (True || hello.length() > 0) {
        // System.out.println("true");
        // } else {
        // System.out.println("false");
        // }

        if (hello.isEmpty() && yes) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (grade <= 100 && !false) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (!yes || no) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // Error
        // if (grade > 75 > amount) {
        // System.out.println("true");
        // } else {
        // System.out.println("false");
        // }

        if (amount <= hiVal && amount >= loVal) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (no && !no || yes && !yes) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
