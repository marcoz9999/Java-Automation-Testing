package org.QAE;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesStringHash {
    public static void main(String[] args)
    {
        char str[] = "geeksforgeeks".toCharArray();
        int n = str.length;
        // Create a set using String characters
        // excluding '\0'
        HashSet<Character> s = new LinkedHashSet<>(n - 1);
        // HashSet doesn't allow repetition of elements
        for (char x : str)
            s.add(x);

        // Print content of the set
        for (char x : s)
            System.out.print(x);
    }
}
