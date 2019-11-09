package org.launchcode.java.exercises.lsn2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    static public void main(String[] args) {

        // part 1
        ArrayList<Integer> ints = new ArrayList<>();
        ArrayList evens;

        for(int i = 1; i <= 25; i++) {
            ints.add(i);
        }

        evens = findEven(ints);
        System.out.println(evens);

        // parts 2-4
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] sentenceArr = sentence.replace(",", "").replace(".", "").split(" ");
        ArrayList<String> sentenceList = new ArrayList<>(Arrays.asList(sentenceArr));
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a length to search the string for:");
        int length = input.nextInt();

        ArrayList foundStrings = lengthSearch(sentenceList, length);

        System.out.println(foundStrings);
        input.close();

    }

    private static ArrayList findEven(ArrayList<Integer> arr) {
        ArrayList<Integer> evenInts = new ArrayList<>();

        for (Integer integer : arr) {
            if (integer % 2 == 0) {
                evenInts.add(integer);
            }
        }
        return evenInts;
    }

    private static ArrayList lengthSearch(ArrayList<String> arr, int length) {
        ArrayList<String> foundStrings = new ArrayList<>();

        for (String s : arr) {
            if (s.length() == length) {
                foundStrings.add(s);
            }
        }
        return foundStrings;
    }


}
