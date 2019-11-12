package org.launchcode.java.studios.charactercount;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterCounter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = input.nextLine();
        char[] charactersInString = inputString.toCharArray();
        input.close();

        HashMap<Character, Integer> charCount = countCharacters(charactersInString);

        for (Character c : charCount.keySet()) {
            System.out.println(c + ": " + charCount.get(c));
        }

    }

    private static HashMap<Character, Integer> countCharacters(char[] inputStr) {
        HashMap<Character, Integer> count = new HashMap<>();

        for (Character c : inputStr) {
            if (!count.containsKey(c)) {
                count.put(c, 1);
            } else {
                Integer currentCount = count.get(c);
                currentCount++;
                count.put(c, currentCount);
            }
        }

        return count;
    }

}
