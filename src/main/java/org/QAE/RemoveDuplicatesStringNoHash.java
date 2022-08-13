package org.QAE;

public class RemoveDuplicatesStringNoHash {
    public static void main(String[] args) {

        String input = new String("geeksforgeeks");
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if (!output.contains(String.valueOf(input.charAt(i)))) {
                output += String.valueOf(input.charAt(i));
            }
        }
        System.out.println(output);
    }
}
