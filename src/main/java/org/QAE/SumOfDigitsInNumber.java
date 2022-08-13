package org.QAE;

public class SumOfDigitsInNumber {
    public static void main(String[] args) {
        int n = 687;
        int sum;

        /* Single line that calculates sum */
        for (sum = 0; n > 0; sum += n % 10,
                n /= 10);


        System.out.println("the sum is " + sum);
    }
}
