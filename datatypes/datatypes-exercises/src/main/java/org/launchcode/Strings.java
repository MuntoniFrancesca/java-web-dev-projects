package org.launchcode;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String text = "Alice was beginning to get very tired of sitting by her sister" +
                " on the bank, and of having nothing to do: once or twice she had peeped" +
                " into the book her sister was reading, but it had no pictures or conversations in it," +
                " ‘and what is the use of a book,’ thought Alice" +
                " ‘without pictures or conversation?’";

        Scanner input = new Scanner(System.in);
        System.out.println("Which word would you like to look for? ");
        String term = input.nextLine();

        if (text.toLowerCase().contains(term.toLowerCase())) {
            System.out.println ("The term was found!");
            Integer index = text.indexOf(term);
            Integer length = term.length();
            System.out.println("Your search term first appears at index " + index +". Your term is " + length + " characters long.");
            String modifiedSentence = text.replace(term,"CIAO");
            System.out.println(modifiedSentence);
        } else {
            System.out.println ("The term wasn't found");
        }
    }
}
