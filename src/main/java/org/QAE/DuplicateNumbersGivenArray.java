package org.QAE;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbersGivenArray {
    public static void main(String[] args) {
        int[] numbers = new int[]{ 1,2,3,4,5,6,7,8,9,10,10 };

        //Solution 1
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i]==(numbers[j])) {
                    System.out.println(numbers[i] + " is a Duplicate");
                }
            }
        }

        //Solution 2
        Set<Integer> store = new HashSet<>();
        for (int number : numbers) {
            if (store.add(number) == false) {
                System.out.println(number + " is a Duplicate");
            }
        }
    }
}