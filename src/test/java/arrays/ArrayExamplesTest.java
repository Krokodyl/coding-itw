package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayExamplesTest {

    @Test
    void findMissingNumber() {
        int[] numbersMissingSix = new int[]{2, 1, 4, 3, 5, 7};
        int expectedNumber = 6;
        int missingNumber = ArrayExamples.findMissingNumber(numbersMissingSix);
        Assertions.assertEquals(expectedNumber, missingNumber);
    }

    @Test
    void sumOfTwo_Found(){
        int[] numbers = new int[]{2, 1, 4, 3, 5, 7};
        int sum = 10;
        boolean found = ArrayExamples.findSumOfTwo(numbers, sum);
        Assertions.assertTrue(found);
    }

    @Test
    void sumOfTwo_NotFound(){
        int[] numbers = new int[]{1, 4, 8, 5, 7};
        int sum = 10;
        boolean found = ArrayExamples.findSumOfTwo(numbers, sum);
        Assertions.assertFalse(found);
    }
}