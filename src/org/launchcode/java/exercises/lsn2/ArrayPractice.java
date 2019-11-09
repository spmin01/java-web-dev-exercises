package org.launchcode.java.exercises.lsn2;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 5, 8};

        for (int value : arr) {
            if (value % 2 == 1) {
                System.out.println(value);
            }
        }

        String sentence = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        String[] stringArr = sentence.split(" ");
        System.out.println(Arrays.toString(stringArr));

        String[] sentenceArr =  sentence.split("\\. ");
        System.out.println(Arrays.toString(sentenceArr));
    }
}
