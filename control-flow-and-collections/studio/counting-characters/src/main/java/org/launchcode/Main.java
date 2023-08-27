package org.launchcode;

//import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

//        String paragraph = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you've done that, it's pretty straightforward from there.";

//        File file = new File("D:\test.txt");
//        Scanner input = new Scanner(file);
//        String paragraph = input.nextLine();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a paragraph of your choice for character count");
        String paragraph = input.nextLine();

//        ['I','f',' ','t','h','e',' ','p','r','o','d','u','c','t',' ','o','f',...]
        char[] charArray = paragraph.toLowerCase().toCharArray();
//        System.out.println(charArray);

//        {}
        HashMap<Character,Integer> charCountHash = new HashMap<>();

//        {'I':1, 'f':2, ' ':66, 't': 20 ...}
        for (Character letter : charArray) {
//            System.out.println(charCountHash);
            if (('a'<= letter && letter <= 'z')||('0'<= letter && letter <='9')){
            if(charCountHash.containsKey(letter)){
                charCountHash.put(letter,charCountHash.get(letter)+1);
            } else {
                charCountHash.put(letter,1);
            }}
//            System.out.println(charCountHash);
        }
//        System.out.println(charCountHash);

        for (Map.Entry<Character, Integer> entry : charCountHash.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
