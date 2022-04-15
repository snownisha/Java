package A042_ArithmeticOperation;

import java.util.Scanner;

public class ArithmeticOperation {
    public static void main (String args []){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Num1");
        int Num1= scanner.nextInt();
        System.out.println("Enter Num2");
        int Num2= scanner.nextInt();

        int Add = Num1+Num2;
        int Sub = Num1-Num2;
        int Mul = Num1*Num2;
        int Div = Num1/Num2;
        int Mod = Num1%Num2;

        System.out.println("Sum of Number is "  + Add );
        System.out.println("Sub of Number is "  + Sub);
        System.out.println("Mul of Number is "  + Mul);
        System.out.println("Div of Number is "  + Div);
        System.out.println("Mod of Number is "  + Mod);

    }
}
