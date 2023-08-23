package michael.math;

public class Fibonacci {

    private static int f(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }

    public static void main(String[] args) {
        int result = f(2);
        System.out.println(result);
    }

}
