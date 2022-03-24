package A011_FinalVariables;

public class FinalVariable {
    final int x=10;
    final static y=5;

    public static void main (final String[] args){
        final FinalVariable FV = new FinalVariable();
        System.out.println(FV.x + "" + y + " " + args+ " " + tc);
    }
}

/** This will not compile because we cannot reassign any value to a final variable*/

