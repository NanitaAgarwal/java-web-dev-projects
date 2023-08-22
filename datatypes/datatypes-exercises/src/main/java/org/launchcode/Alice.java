package org.launchcode;
import java.util.Scanner;
public class Alice {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, 'and what is the use if a book', thought Alice " +
                "'without pictures or conversation?'";
        System.out.println("Enter a term to search for within the string: ");
        String searchString = input.next();
        input.close();
//        System.out.println(sentence.contains(searchString));
        System.out.println(sentence.toLowerCase().contains(searchString.toLowerCase()));
        int stringIndex = sentence.toLowerCase().indexOf(searchString.toLowerCase());
        System.out.println("Index of " + searchString + " is " + stringIndex);
        int stringLength = searchString.length();
        System.out.println("The length of the searchString " + searchString + " is " + stringLength);
//        System.out.println(sentence.substring(0,stringIndex).concat(sentence.substring(stringIndex+stringLength,sentence.length())));
        System.out.println(sentence.replace(searchString,""));
    }
}
