package A018_PositiveNegative;

public class PositiveNegative {
    public static void main(String[] args) {
        int number = 5;
        if (number < 0.0)
            System.out.println(number + " is a negative number.");
        else if ( number > 0.0)
            System.out.println(number + " is a positive number.");
        else
            System.out.println(number + " is 0.");
    }
}
