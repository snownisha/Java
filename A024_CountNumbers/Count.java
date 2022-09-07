#Counting the Numbers
package A024_CountNumbers;

public class Count {
    public static void main(String[] args) {
        int count = 0, number = 19980508;
            for (;number != 0; number /= 10, ++count) {
            }
            System.out.println("Number of digits: " + count);
        }
    }
