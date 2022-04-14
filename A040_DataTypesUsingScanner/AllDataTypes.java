package A040_DataTypesUsingScanner;

import java.util.Scanner;

import static java.util.Scanner.*;

public class AllDataTypes {
    public static void main (String args []){
        Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your name");
        String Name = scanner.nextLine();


        System.out.println("Enter your Age");
        int Age = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Enter your Email");
        String Email = scanner.nextLine();

        System.out.println("Your name is " + Name);
        System.out.println("Your name is " + Age);
        System.out.println("Your Email is " + Email);




    }
}
