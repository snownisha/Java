package A005_CommandLineAruguments;
/** simple program to print the arguments that passed from the command line*/

public class CommandLineArg {
    public static void main (String[] args){
        for (int i=0; i< args.length;i++){
            System.out.println("args["+i+"]=\""+args[i]+"\"" );
        }
    }
}
