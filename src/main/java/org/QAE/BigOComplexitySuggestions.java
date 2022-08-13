package org.QAE;

public class BigOComplexitySuggestions {
    public static void main(String[] args){
        //"Big O complexity "
        // is a mathematical process that describes the complexity of an algorithm
        // There are two ways of measuring the complexity of an algorithm Space and Time complexity
        // Space complexity measures the exact amount of space an algorithm will take according to the input size
        // It is essentially measured by calculating the space occupied by variables in an algorithm
        // Time complexity  measures the exact amount of time an algorithm will take according to the input size
        // It essentially depends on how many steps an algorithm needs to perform before it finishes execution
        // In simple words, it helps to tell if an algorithm is efficient enough to deal with a huge volume of data

        // O(1) represents a function that always takes the same take regardless of input size.

        // O(n) represents the complexity of a function that increases linearly and in direct proportion to the
        // number of inputs. This is a good example of how Big O Notation describes the worst case scenario as
        // the function could return the true after reading the first element or false after reading all n elements

        // O(n2) represents a function whose complexity is directly proportional to the square of the input size
        // Adding more nested iterations through the input will increase the complexity which could then represent
        // O(n3) with 3 total iterations and O(n4) with 4 total iterations.

        // O(2n) represents a function whose performance doubles for every element in the input.
        // This example is the recursive calculation of Fibonacci numbers. The function falls under O(2n)
        // as the function recursively calls itself twice for each input number until the number is less than or equal to one

        // O(log n) represents a function whose complexity increases logarithmically as the input size increases.
        // This makes O(log n) functions scale very well so the handling of larger inputs is much less likely
        // to cause performance problems. The example above uses a binary search to check if the input list contains
        // a certain number. In simple terms it splits the list in two on each iteration until the number is found or
        // the last element is read. If you noticed this method has the same functionality as the O(n) example although
        // the implementation is completely different and more difficult to understand. But, this is rewarded with a much
        // better performance with larger inputs (as seen in the table).

        //https://lankydan.dev/2017/04/23/learning-big-o-notation-with-on-complexity
    }
}
