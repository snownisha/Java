package A043_CompoundAssignment;

public class CompoundAssignment {
    public static void main (String args[]){
        int a=5, b=10;

        int c=++a; // Pre Increment
        int d=--a; // Pre Decrement
        int e=a++; // Post Increment
        int f =a--; // Post Decrement

        a+=10;
        b-=5;

        System.out.println("Pre Increment " + c);
        System.out.println("Pre Decrement " + d);
        System.out.println("Post Increment " + e);
        System.out.println("Post Decrement " + f);
        System.out.println("Value of a is " + a);
        System.out.println("Value of b is " + b);

    }
}
