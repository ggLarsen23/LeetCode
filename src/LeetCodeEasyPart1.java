import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeetCodeEasyPart1 {

    /**
     * Running sum in a nested Loop BigO = O(N^2)
     */
    public int[] runningSum(int[] nums) {
        int[] outputArray = new int[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            int indexNumber = nums[i];
            for (int j = i - 1; j >= 0; j--) {
                indexNumber += nums[j];
            }
            outputArray[i] = indexNumber;
        }
        return outputArray;
    }

    /**
     * Running sum being updated through the array BigO = O(N)
     */
    public int[] runningSum2(int[] nums) {
        int[] outputArray = new int[nums.length];
        int runningSum = 0;
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            outputArray[i] = runningSum;
        }
        return outputArray;
    }

    public int richestCustomerWealth(int[][] accounts) {
        int maximumWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int customerWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                customerWealth += accounts[i][j];
            }
            if (customerWealth > maximumWealth) {
                maximumWealth = customerWealth;
            }
        }
        return maximumWealth;
    }

    public int richestCustomerWealth2(int[][] accounts) {
        int maximumWealth = 0;
        for (int[] customer : accounts) {
            int customerWealth = 0;
            for (int account : customer) {
                customerWealth += account;
            }
            if (customerWealth > maximumWealth) {
                maximumWealth = customerWealth;
            }
        }
        return maximumWealth;
    }

    public List<String> fizzBuzz(int n) {
        List<String> outputString = new ArrayList<String>(n);

        for (int i = 1; i <= n; i++) {
            boolean fizz = i % 3 == 0;
            boolean buzz = i % 5 == 0;

            if (fizz && !buzz) {
                outputString.add(i - 1, "Fizz");
            } else if (buzz && !fizz) {
                outputString.add(i - 1, "Buzz");
            } else if (fizz && buzz) {
                outputString.add(i - 1, "FizzBuzz");
            } else {
                outputString.add(i - 1, String.valueOf(i));
            }
        }
        return outputString;
    }

    public int giveNumberOfStepsToZero(int num) {
        int numberOfSteps = 0;

        for (int i = 0; num > 0; i++) {
            if (num % 2 == 0) {
                num = Math.floorDiv(num, 2);
            } else {
                num = num - 1;
            }
            numberOfSteps++;
        }
        return numberOfSteps;
    }

    /**
     * Is palindrome number, with convert to string
     */
    public boolean isPalindromeNumber(int x) {
        String integerString = Integer.toString(x);

        List<Character> charList = IntStream.range(0, integerString.length())
                .mapToObj(integerString::charAt)
                .collect(Collectors.toList());

        List<Character> backwardsList = new ArrayList<>();

        for (int i = charList.size() - 1; i >= 0; i--) {
            backwardsList.add(charList.get(i));
        }

        return charList.equals(backwardsList);
    }

    /**
     * Containts Duplicate LeetCode, O(log(n)
     * */
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }

    /**
     * isAnagram Leetcode, O(n)
     */
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> word = new HashMap<>(26);
        HashMap<Character, Integer> match = new HashMap<>(26);

        for (char c: s.toCharArray()) {
            word.merge(c, 1, Integer::sum);
        }
        for (char c: t.toCharArray()) {
            match.merge(c,1, Integer::sum);
        }
        return word.equals(match);
    }
}
