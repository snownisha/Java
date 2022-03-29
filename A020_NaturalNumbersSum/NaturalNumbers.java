package A020_NaturalNumbersSum;

public class NaturalNumbers {
    public static void main(String[] args) {
        int num = 500, i = 1, sum = 0;
            while(i <= num)
            {
                sum += i;
                i++;
            }
            System.out.println("Sum = " + sum);
        }
    }

