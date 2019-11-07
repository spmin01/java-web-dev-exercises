package exercises;

import java.util.Scanner;


public class Alice {
    public static void main(String args[]) {
         Scanner input = new Scanner(System.in);
         String aliceText = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: " +
                 "once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, " +
                 "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
         boolean aliceContains;
         int indexOfSearchTerm;
         String[] remainingText;

         System.out.println(aliceText);
         System.out.println("Enter search term: ");
         String searchTerm = input.nextLine();

         aliceContains = aliceText.contains(searchTerm.toLowerCase());
         indexOfSearchTerm = aliceText.indexOf(searchTerm);
         remainingText = aliceText.split(searchTerm);
         System.out.println("Text contained search value: "+ aliceContains);
         System.out.println("Index of search value: " + indexOfSearchTerm);
         System.out.println("Remaining text: " + remainingText[0] + remainingText[1]);

    }
}
