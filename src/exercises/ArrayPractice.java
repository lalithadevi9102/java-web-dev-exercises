package exercises;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayPractice {
    public static void main(String[] args) {
        int[] practiceArray = {1, 1, 2, 3, 5, 8};
        System.out.println("Print each value of the Array:");
        for(int i : practiceArray){
            System.out.println(i);
       }
        System.out.println("Print only the odd numbers of the Array:");
        for(int i : practiceArray){
            if( !(i%2 == 0) ){
                System.out.println(i);
            }
        }
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String sentence1 =  "I would not, could not, in a box: " +
                "I would not, could not with a fox: " +
                "I will not eat them in a house: " +
                "I will not eat them with a mouse:";
        //Use the split method to divide the string at each space and store the individual words in an array
        String[] sentenceArrayWords = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArrayWords));
        //Split the string into separate sentences.
        String[] sentenceArrayPeriod = sentence.split("\\.");

        System.out.println(Arrays.toString(sentenceArrayPeriod));
    }
}
