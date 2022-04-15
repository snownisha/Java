package A049_Loops;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main (String args[]){
        int n;
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        n= Sc.nextInt();
        int i=1;
        while (i<n){
            System.out.println(i);
            i++;
        }
    }
}
