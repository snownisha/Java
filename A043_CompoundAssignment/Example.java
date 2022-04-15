package A043_CompoundAssignment;

public class Example {
    public static void main (String args[]){
        int a=3;int b=4;int c;
        c=a+b+ a++ + b++ + ++a + ++b;

        System.out.println(c);


    }
}
