package HR_003;
import java.util.Scanner;
public class IfElse {
    public static void main (String[]args){
    Scanner input = new Scanner (System.in);
    int n= input.nextInt();
    if (n%2!=0)
    {
        System.out.println("Weird");
    }
   else if (n>=2 && n<=5)
    {
        System.out.println("Not Weird");
    }
   else if (n>=6 && n<=20)
    {
        System.out.println("Weird");
    }
   else if (n>=20)
    {
        System.out.println("Not Weird");
    }
}}
