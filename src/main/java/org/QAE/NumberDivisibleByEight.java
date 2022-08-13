package org.QAE;

public class
NumberDivisibleByEight {
    public static void main(String[] args) {

        int num = 1968;
        if ( (num % 8) == 0)
        System.out.printf("The Number %d is divisible by 8 \n ", num);
        else
        System.out.printf("The Number %d is NOT divisible by 8 \n ", num);

        //Using Bitwise Approach: Result = (((n >> 3) << 3) == n). First we shift the 3 bit right then we shift the 3 bit left
        // and then compare the number with the given number if the number is equal to the number then it is the divisible by 8 .
        //Explanation:
        //Example: n = 16 given so binary of the 16 is 10000 now we shift the 3 bit right, now we have 00010 so again we shift the 3
        //bit left then we have 10000 now compare with the given number first 16==16 in binary so it true so the number is divisible by 8.
        int n = 1968;
        if (((n >> 3) << 3) == n)
            System.out.printf("The Number %d is divisible by 8 \n  ", num);
        else
            System.out.printf("The Number %d is NOT divisible by 8 \n ", num);
    }
}
