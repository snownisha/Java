package A025_CheckingString;

public class NullOrEmpty {
    public static void main(String[] args) {
        String str = "    ";
        System.out.println("str is " + isNullEmpty(str));
    }

    // method check if string is null or empty
    public static String isNullEmpty(String str) {

        // To check if the string is null
        if (str == null) {
            return "NULL";
        }

        // To check if the string is empty
        else if (str.trim().isEmpty()){
            return "EMPTY";
        }

        else {
            return "neither Empty nor Null";
        }
    }
}
