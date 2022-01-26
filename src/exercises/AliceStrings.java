package exercises;
import java.util.Scanner;
public class AliceStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = ("Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'");
        System.out.println("Enter a word or phrase to search for:");
        String term = input.nextLine();
        boolean isFound = sentence.toLowerCase().contains(term.toLowerCase());
        System.out.println(isFound);
        if (isFound) {
            int termIndex = sentence.toLowerCase().indexOf(term.toLowerCase());
            System.out.println("Entered phrase length: " + term.length());
            System.out.println("Entered phrase index: " + termIndex);
            sentence = sentence.substring(0, termIndex) + sentence.substring(termIndex + term.length(), sentence.length() - 1);
            System.out.println("First sentence with '" + term + "' removed:");
            System.out.println(sentence);
        } else {
            System.out.println("Word not found.");
        }


    }
}
