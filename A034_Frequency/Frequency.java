package A034_Frequency;

public class Frequency {

    public static void main(String[] args) {
        String str = "I am Snow Nisha Amala Doss.";
        char ch = 's';
        int frequency = 0;

        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);
    }
}
