package A032_FibonacciSeries;

public class Fibonacci {
    public static void main(String args[]) {
        int a = 0, b = 1, n, i, count = 5;
        System.out.print(a + " " + b);

        for (i = 2; i < count; ++i)
        {
            n= a + b;
            System.out.print(" " + n);
            a = b;
            b= n;
        }
    }
}