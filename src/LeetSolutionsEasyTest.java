import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LeetSolutionsEasyTest {

    @org.junit.jupiter.api.Test
    void runningSumTest() {
        int[] input = {1,2,3,4,5};
        LeetSolutionsEasy leetSolutionsEasy = new LeetSolutionsEasy();
        int[] output = leetSolutionsEasy.runningSum(input);

        System.out.println("Actual output: " + Arrays.toString(output));
        int[] expected = {1,3,6,10,15};
        assertEquals(Arrays.toString(expected), Arrays.toString(output));

        int[] input2 = {1,-1,1,-1,1};
        int[] output2 = leetSolutionsEasy.runningSum(input2);

        System.out.println("Actual output: " + Arrays.toString(output2));
        int[] expected2 = {1,0,1,0,1};
        assertEquals(Arrays.toString(expected2), Arrays.toString(output2));
    }

    @org.junit.jupiter.api.Test
    void runningSum2Test() {
        int[] input = {1,2,3,4,5};

        LeetSolutionsEasy leetSolutionsEasy = new LeetSolutionsEasy();
        int[] output = leetSolutionsEasy.runningSum2(input);

        System.out.println("Actual output: " + Arrays.toString(output));
        int[] expected = {1,3,6,10,15};
        assertEquals(Arrays.toString(expected), Arrays.toString(output));
    }

    @org.junit.jupiter.api.Test
    void richestCustomerWealthTest() {
        int[][] accounts = {{1,2,3},{3,2,1}};

        int[][] accounts2 = {{1,5},{7,3},{3,5}};

        LeetSolutionsEasy leetSolutionsEasy = new LeetSolutionsEasy();
        int maximumWealth = leetSolutionsEasy.richestCustomerWealth(accounts2);

        System.out.println("Actual output: " + maximumWealth);
        int expected = 10;
        assertEquals(expected, maximumWealth);
    }

    @org.junit.jupiter.api.Test
    void fizzBuzzTest() {
        int input = 15;

        LeetSolutionsEasy leetSolutionsEasy = new LeetSolutionsEasy();
        String fizzBuzzResult = leetSolutionsEasy.fizzBuzz(input).toString();

        System.out.println("Actual output: " + fizzBuzzResult);
        String expected = "[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]";
        assertEquals(expected, fizzBuzzResult);
    }
    @org.junit.jupiter.api.Test
    void giveNumberOfStepsToZeroTest() {
        int input = 14;

        LeetSolutionsEasy leetSolutionsEasy = new LeetSolutionsEasy();
        int numberOfStepsToZero = leetSolutionsEasy.giveNumberOfStepsToZero(input);

        System.out.println("Actual output: " + numberOfStepsToZero);
        int expected = 6;
        assertEquals(expected, numberOfStepsToZero);
    }
}