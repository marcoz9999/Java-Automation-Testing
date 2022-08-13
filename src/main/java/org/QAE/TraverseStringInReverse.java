package org.QAE;

import java.util.Arrays;
import java.util.List;

public class TraverseStringInReverse {
    public static void main(String[] args)
    {

        // create a list
        List<Integer> Arlist = Arrays.asList(5, 4, 8, 2);

        System.out.println("Reversed :");

        // Printing in reverse
        for (int i = Arlist.size() - 1; i >= 0; i--) {
            System.out.println(Arlist.get(i));
        }
    }
}
