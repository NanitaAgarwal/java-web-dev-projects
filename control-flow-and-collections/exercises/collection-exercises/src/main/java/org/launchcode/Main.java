package org.launchcode;

import java.util.*;

public class Main {
    public static void main(String[] args){
        int[] intArray={1, 1, 2, 3, 5, 8};
        for (int i:intArray){
            if (!(i % 2 ==0) ) {
                System.out.println(i);
            }
        }
       String paragraph="I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] paragraphArray=paragraph.split("\\.");
        System.out.println(Arrays.toString(paragraphArray));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        System.out.println("The ArrayList is " + numbers);
        System.out.println("The sum of even numbers in Arraylist is " + Sum.sumOfEven(numbers));

        ArrayList<String> words = new ArrayList<>();
        String word;
        System.out.println("please enter some words");
        Scanner input=new Scanner(System.in);
        do {
            word = input.nextLine();

            if (!word.equals("")) {
                words.add(word);
            }

        } while(!word.equals(""));
        DisplayWords.display(words);


        String[] newParagraphArray=paragraph.split(" ");
        System.out.println("The new array of words from paragraph is " + Arrays.toString(newParagraphArray));
        ArrayList<String> newWords = new ArrayList<>();

        for (String y: newParagraphArray) {
            newWords.add(y);
        }
        DisplayWords.display(newWords);

        HashMap<Integer,String> students = new HashMap<>();
        Integer id;
        String name;
        do{
            System.out.println("Please Enter Student Name");
            name = input.nextLine();
            if (!name.equals("")){
                System.out.println("Please Enter Student ID for " + name + ": ");
                id = input.nextInt();
                students.put(id,name);
                input.nextLine();
            }
            System.out.println("After - " + students);
        } while (!name.equals(""));

        System.out.println("Final HashMap is" + students);
        System.out.println("\nClass Roaster:");
        for (Map.Entry<Integer,String> student:students.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }
    }
}