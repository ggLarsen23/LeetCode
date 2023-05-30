import java.sql.Array;
import java.util.Arrays;

public class NeetCode02_TwoPointers {

    /**125. Valid Palindrome,  O(n) */
    public static boolean isPalindrome(String s) {

        try {
            if (s.isEmpty()) {
                return false;
            }
        } catch (NullPointerException nullPointerException) {
            System.out.println("Null parameter detected: " + nullPointerException.getMessage());
            return false;
        }

        String onlyLetterString = s.replaceAll("[^A-Za-z0-9]+","");

        char[] charArray = onlyLetterString.toUpperCase().toCharArray();
        char[] inverseArray = new char[charArray.length];
        int j = 0;

        for (int i = charArray.length - 1; 0 <= i; i--) {
            inverseArray[j] = charArray[i];
            j++;
        }
        return Arrays.equals(charArray, inverseArray);
    }

    /** 167. Two Sum II - Input Array Is Sorted, 0(n^2) */
    public static int[] twoSum(int[] numbers, int target) {

        int[] result = new int[2];

        for (int i = 0; i <= numbers.length; i++) {

            for (int j = i + 1; j <= numbers.length - 1; j++) {

                if(Math.addExact(numbers[i], numbers[j]) == target) {

                    result[0] = i+1;
                    result[1] = j+1;
                    return result;
                }
            }
        }
        return null;
    }

    /** 167. Two Sum II - Input Array Is Sorted, 0(n) */
    public static int[] twoSum2(int[] numbers, int target) {

        int[] result = new int[2];

        int i = 0;
        int j = numbers.length - 1;
        int left, right;

        while (i < j) {
            left = numbers[i];
            right = numbers[j];
            if(left + right == target)  {break;}
        }

//        for (int i = 0; i <= numbers.length; i++) {
//
//            for (int j = i + 1; j <= numbers.length - 1; j++) {
//
//                if(Math.addExact(numbers[i], numbers[j]) == target) {
//
//                    result[0] = i+1;
//                    result[1] = j+1;
//                    return result;
//                }
//            }
//        }
        return null;
    }
}
