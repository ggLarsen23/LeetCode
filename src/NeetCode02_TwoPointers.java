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
}
