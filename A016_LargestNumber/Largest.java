package A016_LargestNumber;

public class Largest {
    public static void main(String[] args) {
        double n1 = 2.5, n2 = 3.1, n3 = 4.5;

            if( n1 >= n2 && n1 >= n3)
                System.out.println(n1 + " is the largest number.");

            else if (n2 >= n1 && n2 >= n3)
                System.out.println(n2 + " is the largest number.");

            else
                System.out.println(n3 + " is the largest number.");
        }
    }

