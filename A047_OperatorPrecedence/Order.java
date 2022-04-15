package A047_OperatorPrecedence;

public class Order {
    public static void main (String args[]){
        int a =15; int b=5;
        int c= a+b-5*2;
        int d= (a+10)-(5*2);
        System.out.println(c);
        System.out.println(d);
    }
}
