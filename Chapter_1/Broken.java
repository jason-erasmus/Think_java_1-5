public class Broken {

    // public static void firstError() {
    // System.out.println("Hello, World");
    // }

    public static void main(String[] args) {
        System.out.println(("Hello, World!"));
    }
}
// Remove one of the opening curly braces.
// Broken.java:1: error: '{' expected
// public class Broken

// Remove one of the closing curly braces.
// Broken.java:9: error: reached end of file while parsing
// }

// Instead of main, write mian.
// Error: Main method not found in class Broken, please define the main method
// as:
// public static void main(String[] args)
// or a JavaFX application class must extend javafx.application.Application

// Remove the word static.
// Error: Main method is not static in class Broken, please define the main
// method as:
// public static void main(String[] args)

// Remove the word public.
// Error: Main method not found in class Broken, please define the main method
// as:
// public static void main(String[] args)
// or a JavaFX application class must extend javafx.application.Application

// Remove the word System.
// Broken.java:8: error: cannot find symbol
// out.println("Hello, World!");
// ^
// symbol: variable out
// location: class Broken

// Replace println with Println.
// Broken.java:8: error: cannot find symbol
// System.out.Println("Hello, World!");
// ^
// symbol: method Println(String)
// location: variable out of type PrintStream

// Replace println with print.
// Does not throw error hoever console will not start on new line

// Delete one parenthesis.
// Broken.java:8: error: not a statement
// System.out.println"Hello, World!";
// ^
// Broken.java:8: error: ';' expected
// System.out.println"Hello, World!";

// Add an extra parenthesis.
// No visable error