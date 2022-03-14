package A007_UninitializedVariables;

public class UninitializedVariables {
    static int p; /** It is numeric type & the output will be 0*/
    static  double q; /** It is floating type & the output will be 0.0*/
    static boolean r; /** It is boolean type & the output will be false*/
    static String S; /** It is reference type & the output will be null*/
    public static void main (String [] args){
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
        System.out.println(S);
    }
}
