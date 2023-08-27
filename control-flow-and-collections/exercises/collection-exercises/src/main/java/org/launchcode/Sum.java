package org.launchcode;

import java.util.ArrayList;

public class Sum {
    public static int sumOfEven(ArrayList<Integer> numbers){
        Integer sum = 0;
        for (Integer i : numbers) {
            if(i%2==0){
                System.out.println(i);
            sum += i;
        }}
        return sum;
    }
}
