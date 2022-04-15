package A049_Loops;

public class OddNumbers {
    public static void main (String args[]){
        int n=100;
        for (int i=1; i<=n;i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}
