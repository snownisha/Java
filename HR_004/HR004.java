package HR_004;
import java.util.Scanner;

public class HR004 {
    public static void main (String[]args){
        Scanner scanner = new Scanner (System.in);

        int Int = scanner.nextInt();

        double Double = scanner.nextDouble();
        String str = scanner.nextLine();
        str += scanner.nextLine();

        System.out.println("String: " + str);
        System.out.println("Double: " + Double);
        System.out.println("Int: " + Int);

    }
}
