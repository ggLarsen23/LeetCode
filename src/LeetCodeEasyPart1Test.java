
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LeetCodeEasyPart1Test {

    @Test
    void runningSumTest() {
        int[] input = {1,2,3,4,5};
        LeetCodeEasyPart1 leetCodeEasyPart1 = new LeetCodeEasyPart1();
        int[] output = leetCodeEasyPart1.runningSum(input);

        System.out.println("Actual output: " + Arrays.toString(output));
        int[] expected = {1,3,6,10,15};
        assertEquals(Arrays.toString(expected), Arrays.toString(output));

        int[] input2 = {1,-1,1,-1,1};
        int[] output2 = leetCodeEasyPart1.runningSum(input2);

        System.out.println("Actual output: " + Arrays.toString(output2));
        int[] expected2 = {1,0,1,0,1};
        assertEquals(Arrays.toString(expected2), Arrays.toString(output2));
    }

    @Test
    void runningSum2Test() {
        int[] input = {1,2,3,4,5};

        LeetCodeEasyPart1 leetCodeEasyPart1 = new LeetCodeEasyPart1();
        int[] output = leetCodeEasyPart1.runningSum2(input);

        System.out.println("Actual output: " + Arrays.toString(output));
        int[] expected = {1,3,6,10,15};
        assertEquals(Arrays.toString(expected), Arrays.toString(output));
    }

    @Test
    void richestCustomerWealthTest() {
        int[][] accounts = {{1,2,3},{3,2,1}};

        int[][] accounts2 = {{1,5},{7,3},{3,5}};

        LeetCodeEasyPart1 leetCodeEasyPart1 = new LeetCodeEasyPart1();
        int maximumWealth = leetCodeEasyPart1.richestCustomerWealth(accounts2);

        System.out.println("Actual output: " + maximumWealth);
        int expected = 10;
        assertEquals(expected, maximumWealth);
    }

    @Test
    void fizzBuzzTest() {
        int input = 15;

        LeetCodeEasyPart1 leetCodeEasyPart1 = new LeetCodeEasyPart1();
        String fizzBuzzResult = leetCodeEasyPart1.fizzBuzz(input).toString();

        System.out.println("Actual output: " + fizzBuzzResult);
        String expected = "[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]";
        assertEquals(expected, fizzBuzzResult);
    }
    @Test
    void giveNumberOfStepsToZeroTest() {
        int input = 14;

        LeetCodeEasyPart1 leetCodeEasyPart1 = new LeetCodeEasyPart1();
        int numberOfStepsToZero = leetCodeEasyPart1.giveNumberOfStepsToZero(input);

        System.out.println("Actual output: " + numberOfStepsToZero);
        int expected = 6;
        assertEquals(expected, numberOfStepsToZero);
    }

    @Test
    void isPalindromeNumberTest() {
        int input = 121;
        LeetCodeEasyPart1 leetCodeEasyPart1 = new LeetCodeEasyPart1();
        boolean isPalindrome = leetCodeEasyPart1.isPalindromeNumber(input);
        assertTrue(isPalindrome);

        int input2 = 123;
        boolean isPalindrome2 = leetCodeEasyPart1.isPalindromeNumber(input2);
        assertFalse(isPalindrome2);
    }
}