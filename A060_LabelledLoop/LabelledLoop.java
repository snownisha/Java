#Labelled loop in j
package A060_LabelledLoop;

public class LabelledLoop {
    public static void main (String[] args) {
        int i,j;
        outerLoop:
            for (i=1; i>=5;i++){
        innerLoop:
         for (j=1; j>=5;j++){
             if(i==3 && j==3)
                 break outerLoop;
             System.out.println("*");
         }
         System.out.println("/n");

            }
    }
}
