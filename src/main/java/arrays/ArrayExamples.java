package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayExamples {

    /**
     * You are given an array of positive numbers from 1 to n, such that all numbers from 1 to n are present
     * except one number x. You have to find x. The input array is not sorted.
     * @param numbers
     * @return
     */
    static int findMissingNumber(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        int n = numbers.length+1;
        int expectedSum = n*(n+1)/2;
        return expectedSum-sum;
    }

    static boolean findSumOfTwo(int[] numbers, int sum) {
        Set<Integer> complements = new HashSet<>(); 
        for (int n : numbers) {
            int complement = sum-n;
            if (complements.contains(n)) return true;
            else complements.add(complement);
        }
        return false;
    }
}
