package org.launchcode;
import java.util.Scanner;

//import java.lang.Math.*;
public class Area {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        double area;
        double radius;
        System.out.println("Enter the radius");
        radius=input.nextDouble();
        area= Circle.getArea(radius);
        System.out.println("Area of a circle is " + area );
        input.close();
    }
}