package A015_SwapNumbers;

public class Swapping {

        public static void main(String[] args) {

            int first = 5, second = 8;

            System.out.println("Before swapping");
            System.out.println("First number = " + first);
            System.out.println("Second number = " + second);
            int temp = first;
            first = second;
            second = temp;

            System.out.println("After swap");
            System.out.println("First number = " + first);
            System.out.println("Second number = " + second);
        }
}
