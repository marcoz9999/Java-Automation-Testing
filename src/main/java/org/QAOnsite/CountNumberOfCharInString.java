package org.QAOnsite;

public class CountNumberOfCharInString {
        public static void main(String[] args) {

            String exampleString = "This is just a sample string";

            int stringLength = exampleString.length();

            System.out.println("String length: " + stringLength);

            int stringLengthWithoutSpaces = exampleString.replace(" ", "").length();
            System.out.println("String length without counting whitespaces: " + stringLengthWithoutSpaces);
        }
}
