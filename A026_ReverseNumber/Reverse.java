package A026_ReverseNumber;

public class Reverse {
    public static void main(String[] args) {
        int num = 1998;
        int reverse = 0;
        System.out.println("Before Reversal: " + num);

        while(num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reverse);
    }
}
