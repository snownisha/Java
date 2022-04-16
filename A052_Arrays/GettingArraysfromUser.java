package A052_Arrays;

import java.util.Scanner;

public class GettingArraysfromUser {
    public static void main (String args[]){
        int a [] = new int [7];
        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter the Value of Arrays: ");

        for (int i=0; i<a.length;i++)
            a [i] = Sc.nextInt();

        for (int i=0; i<a.length;i++)
            System.out.println(a[i]);

    }
}
