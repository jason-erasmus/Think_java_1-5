package Chapter_2;

public class Date {

    public static void main(String[] args) {
        String day = "Monday";
        int date = 7;
        String month = "July";
        int year = 2025;

        // String test = FMT."Test Date: {day} {date} {month} {year}";

        System.out.println("American Format: " + day + ", " + month + " " + date + ", " + year);
        System.out.println("Normal Format: " + day + " " + date + " " + month + " " + year);
        // System.out.println(test);

    }
}
