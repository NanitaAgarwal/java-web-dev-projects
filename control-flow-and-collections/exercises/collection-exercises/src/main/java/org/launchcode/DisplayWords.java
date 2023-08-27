package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public class DisplayWords {
    public static void display(ArrayList<String> words){
        System.out.println("enter the number ");
        Integer number;
        Scanner input=new Scanner(System.in);
        number=input.nextInt();
        for(String i:words){


        if (i.length() == number)
            System.out.println(i);}
    }
}
