package strings;

public class TextProcessor {

    public static void main(String[] args) {
//        countWords("I love Java");
        reverseString("Hello world");
    }

    public static void countWords(String text){
        var words = text.split(" "); //string[]
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words", numberOfWords); //%d - will be sending digit
        System.out.println(message);

        for(String word : words){
            System.out.println(word);
        }
    }

    public static void reverseString(String text){
        for(int i=text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
    }
}
