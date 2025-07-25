
package Chapter_4;

public class MultAdd {

    public static double multAdd(double a, double b) {
        double power = Math.exp(a);
        System.out.println("power e: " + power);

        double pi = Math.PI;

        double result = Math.sin(pi / 4) + (Math.cos(pi / 4) / 2);
        double result_log = Math.log(a) + Math.log(b);
        System.out.println("Trig: " + result);
        System.out.println("Log: " + result_log);

        return result;
    }

    public static void expSum(double num) {
        multAdd(2.0, num);
    }

    public static void main(String[] args) {
        double a = 10.0;
        double b = 20.0;

        expSum(2.0);
    }
}
