package org.launchcode;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        float mileage;
        float milesDriven;
        float fuelConsumed;
        System.out.println("Enter milesDriven: ");
        milesDriven=input.nextFloat();
        System.out.println("Enter fuelConsumed: ");
        fuelConsumed=input.nextFloat();
        input.close();
        mileage=milesDriven/fuelConsumed;
        System.out.println("Miles per gallon is " + mileage);

    }
}
