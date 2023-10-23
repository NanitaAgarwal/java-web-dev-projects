package org.launchcode;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        Scanner input;
        input= new Scanner(System.in);
        System.out.println("Enter test points");
        int testPoints = input.nextInt();
        System.out.println("Enter possible points");
        int possiblePoints = input.nextInt();

        System.out.println("The student has scored " + Divide(testPoints,possiblePoints)*100 + "%!");

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static double Divide(int x, int y)
    {
        // Write code here!
        try {
            if (y == 0) {
                throw new ArithmeticException("WARNING: You are trying to divide by zero!");
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return ((double) x)/y;
    }

    public static void CheckFileExtension(String fileName)
    {
        // Write code here!
    }
}
