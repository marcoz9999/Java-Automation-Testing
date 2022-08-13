package org.QAE;
import java.lang.*;

public class LongestPalindromeSubString {
    public static void main(String[] args)
    {
        String str = "mojologiccigolmojo radar circleelcric";
        int n = str.length();
        int max = 1, start = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                boolean flag = true;

                for (int k = 0; k < (j - i + 1) / 2; k++)
                    if (str.charAt(i + k) != str.charAt(j - k))
                        flag = false;
                if (flag && (j - i + 1) > max) {
                    start = i;
                    max = j - i + 1;
                }
            }
        }

        System.out.println(str.substring(start,start+max));

    }


}
