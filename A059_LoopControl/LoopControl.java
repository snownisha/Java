package A059_LoopControl;
import java.util.Scanner;

public class LoopControl {
    public static void main (String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of n: " );
        n=scanner.nextInt();

        while (true){
            if(n%10==0){
                System.out.println(n);
                break;
            }
            n--;


        }
    }
}
