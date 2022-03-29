package A021_RemovingWhitespaces;

public class Whitespaces {
    public static void main(String[] args) {
        String sentence = "S now    N i     s  h a";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
    }

}
