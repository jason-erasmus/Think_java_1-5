public class Date {

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println("American Format: " + day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println("Normal Format: " + day + " " + date + " " + month + " " + year);
    }

    public static void main(String[] args) {
        String day = "Monday";
        int date = 21;
        String month = "July";
        int year = 2025;

        printAmerican("Monday", 21, "July", 2025);
        printEuropean(day, date, month, year);

    }
}
