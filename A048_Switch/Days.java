package A048_Switch;

import java.util.Scanner;

public class Days {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter the Number(1-7) :");
        int daysNumber = userinput.nextInt();
        switch (daysNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println(daysNumber + " please enter the correct day!!");
                break;
        }
        userinput.close();
    }
}