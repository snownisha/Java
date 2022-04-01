package A030_StarPattern;

public class StarPattern {
    public static void main(String args[]) {
        {
            int n = 5;
            //Outer Loop for number of Rows
            for (int i = 0; i < n; i++) {
                // printing '*' in each column.
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}