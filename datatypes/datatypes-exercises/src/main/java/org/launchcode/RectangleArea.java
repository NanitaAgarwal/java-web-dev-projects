package org.launchcode;
import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args){
        float area;
        float length;
        float height;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of the rectangle: ");
        length=input.nextFloat();
        System.out.println("Enter height of the rectangle: ");
        height=input.nextFloat();
        input.close();
        area = (length*height);
        System.out.println("Area of rectangle is " + area);
    }
}
