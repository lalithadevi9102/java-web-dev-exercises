package org.launchcode.java.studios.countingcharacters;
import java.util.Scanner;
import java.util.HashMap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> charCount = new HashMap<>();
        // get text from file
       String inputText = " ";
        try {
            inputText = new String(Files.readAllBytes(Paths.get("text.txt")));
        } catch (IOException ignored) {
            System.out.println("ERROR READING FILE");
        }
        // user input version:
       Scanner input = new Scanner(System.in);
        System.out.print("Please enter a string: ");
         inputText = input.nextLine();
        // original version:
     inputText = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charArray = inputText.toCharArray();
        for (char c : charArray) {
            int charASCII = Character.toLowerCase(c);
            if (charASCII >= 97 && charASCII <= 122) {
                String arrayChar = Character.toString(c).toLowerCase();
                if (charCount.containsKey(arrayChar)) {
                    charCount.put(arrayChar, charCount.get(arrayChar) + 1);
                } else {
                    charCount.put(arrayChar, 1);
                }
            }
        }
        for (String key : charCount.keySet()) {
            System.out.println(key + ": " + charCount.get(key));
        }
    }
}