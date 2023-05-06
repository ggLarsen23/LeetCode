import Constants.RomanNumerals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeetCodeMediumPart1 {

    /**
     * Find longest palindrome O(n^3), not efficient enough for LeetCode as (n = 500) requires O(n^2)
     */
    public static String longestPalindromeSubstring(String s) {
        List<Character> charList = IntStream.range(0, s.length())
                .mapToObj(s::charAt)
                .collect(Collectors.toList());

        List<Character> matchList = new ArrayList<Character>();
        List<Character> largestPalindromeList = new ArrayList<Character>();

        for (int i = 0; i < s.length(); i++) {
            matchList.add(charList.get(i));

            int size = matchList.size();
            List<Character> tmpMatchList = new ArrayList<>(matchList);
            for (int j = 0; !isPalindrome(tmpMatchList) && j < size; j++) {
                tmpMatchList.remove(0);
            }

            if (isPalindrome(tmpMatchList) && tmpMatchList.size() > largestPalindromeList.size()) {
                largestPalindromeList = tmpMatchList;
            }
        }

        // create object of StringBuilder class and create string of char list
        StringBuilder sb = new StringBuilder();
        for (Character ch : largestPalindromeList) {
            sb.append(ch);
        }
        String largestPalindrome = sb.toString();

        return largestPalindrome;
    }

    public static Boolean isPalindrome(List<Character> characterList) {

        if (characterList.size() == 0) {
            return false;
        }

        List<Character> backwardsList = new ArrayList<>();
        for (int i = characterList.size() - 1; i >= 0; i--) {
            backwardsList.add(characterList.get(i));
        }

        return characterList.equals(backwardsList);
    }

    public String intToRoman(int num) {

        //56 = 50 + 5 + 1
        //

        int newValue = RomanNumerals.L.romanValue;

        return null;
    }
}

