package exercises;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class ArrayListPractice {
    public static void main(String[] arg) {
        ArrayList<Integer> integerArray = new ArrayList<>(); // Within main, create a list with at least 10 integers and call your method on the list.
        integerArray.add(0);
        integerArray.add(1);
        integerArray.add(2);
        integerArray.add(3);
        integerArray.add(4);
        integerArray.add(5);
        integerArray.add(6);
        integerArray.add(7);
        integerArray.add(8);
        integerArray.add(9);
        // print ArrayList
        System.out.println("ArrayList : " + integerArray);
        System.out.println(sumEven(integerArray));
        // Within main, create a list with at least 10 integers and call your method on the list.
        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add("car");
        words.add("juice");
        words.add("tiger");
        words.add("orange");
        words.add("frog");
        words.add("close");
        words.add("tour");
        words.add("drive");
        words.add("apple");
        // print ArrayList
        System.out.println("Words : " + words);
        wordsByLength(words);

        }

        // 1. Write a static method to find the sum of all the even numbers in an
        // ArrayList.
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
    // 2. Write a static method to print out each word in a list that has exactly 5 letters.
    public static void wordsByLength(ArrayList<String> arr) {
        // 3. Modify your code to prompt the user to enter the word length for the search.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
//         loop through an ArrayList with the for-each loop
        for (String word : arr) {
            if (word.length() == numChars) {
                System.out.println(word);
            }
        }
    }
}
