package A023_PrimeNumber;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 121, i = 2;
        boolean b= false;
        while (i <= num / 2) {
            if (num % i == 0) {
                b= true;
                break;
            }++i;
        }
        if (!b)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
