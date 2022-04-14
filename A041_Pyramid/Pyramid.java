package A041_Pyramid;

import java.util.Scanner;

public class Pyramid {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Rows = ");
        int rows = sc.nextInt();

        System.out.print("Please Enter Character for Pyramid Pattern = ");
        char ch = sc.next().charAt(0);

        System.out.println("--------");
        PyramidPattern(rows, ch);

    }
    public static void PyramidPattern(int rows, char ch) {
        for (int i = 1 ; i <= rows; i++ )
        {
            for (int j = 0 ; j < rows - i; j++ )
            {
                System.out.print(" ");
            }
            for (int k = 0 ; k < (i * 2) - 1; k++ )
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }}
