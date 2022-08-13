package org.QAE;

public class NArrayNumberMultiplyByM {
    public static void main(String[] args) {
        int m = 2;
        int [] intArray = new int [] {10,20,30,40,50,60,70,80};
        for(int i = 0 ; i < intArray.length ; i++) {
            int productOfM = intArray[i] * m ;
            String bStr = String.valueOf(productOfM);
            System.out.printf(" %d multiply by %d is %d \n" , intArray[i] , m , productOfM);
            System.out.printf("the last 2 digits of %d is %s \n",productOfM,bStr.substring(bStr.length()-2));
        }
    }
}
