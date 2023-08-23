package michael.math;

public class Factorial {

    private static int f(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * f(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = f(5);
        System.out.println(result);
    }

}
