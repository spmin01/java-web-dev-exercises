package org.launchcode.java.studios.charactercount;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterCounter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = input.nextLine();
        char[] charactersInString = inputString.toLowerCase().toCharArray();
        input.close();

        HashMap<Character, Integer> charCount = countCharacters(charactersInString);

        for (Character c : charCount.keySet()) {
            System.out.println(c + ": " + charCount.get(c));
        }

    }

    //
    // Takes an array of characters, returns a HashMap of the total counts of those characters
    // in format "char": count
    //
    private static HashMap<Character, Integer> countCharacters(char[] inputStr) {
        HashMap<Character, Integer> count = new HashMap<>();

        for (Character c : inputStr) {
            // check if character is a letter
            if(Character.isLetter(c)) {
                // add new key at count 1 if character is not already in map
                if (!count.containsKey(c)) {
                    count.put(c, 1);
                } else {
                    Integer currentCount = count.get(c);
                    currentCount++;
                    count.put(c, currentCount);
                }
            }
        }

        return count;
    }

}
