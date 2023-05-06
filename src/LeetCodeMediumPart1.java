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

    public static String intToRoman(int num) {

        String romanString = "";
        int remainder = num;
        //56 = 50 + 5 + 1
        //

        while (remainder > 0)
        {
            if (remainder < 0 && num < 4) {
                remainder -= RomanNumerals.I.romanValue;
                romanString = romanString.concat(RomanNumerals.I.toString());
            }
            else if (remainder == 4) {
                remainder -= RomanNumerals.IV.romanValue;
                romanString = romanString.concat(RomanNumerals.IV.toString());
            }
            else if (remainder >= 5 && remainder < 9) {
                remainder -= RomanNumerals.V.romanValue;
                romanString = romanString.concat(RomanNumerals.V.toString());
            }
            else if (remainder == 9) {
                remainder -= RomanNumerals.IX.romanValue;
                romanString = romanString.concat(RomanNumerals.IX.toString());
            }
            else if (remainder >= 10 && remainder <= 40) {
                remainder -= RomanNumerals.X.romanValue;
                romanString = romanString.concat(RomanNumerals.X.toString());
            }
            else if (remainder >= 40 && remainder < 50) {
                remainder -= RomanNumerals.XL.romanValue;
                romanString = romanString.concat(RomanNumerals.XL.toString());
            }
            else if (remainder > 50 && remainder <= 90) {
                remainder -= RomanNumerals.L.romanValue;
                romanString = romanString.concat(RomanNumerals.L.toString());
            }
            else if (remainder >= 90 && remainder < 100) {
                remainder -= RomanNumerals.XC.romanValue;
                romanString = romanString.concat(RomanNumerals.XC.toString());
            }
            else if (remainder >= 100 && remainder <= 400) {
                remainder -= RomanNumerals.C.romanValue;
                romanString = romanString.concat(RomanNumerals.C.toString());
            }
            else if (remainder >= 400 && remainder < 500) {
                remainder -= RomanNumerals.CD.romanValue;
                romanString = romanString.concat(RomanNumerals.CD.toString());
            }
            else if (remainder > 500 && remainder <= 900) {
                remainder -= RomanNumerals.D.romanValue;
                romanString = romanString.concat(RomanNumerals.D.toString());
            }
            else if (remainder > 900 && remainder < 1000) {
                remainder -= RomanNumerals.CM.romanValue;
                romanString = romanString.concat(RomanNumerals.CM.toString());
            }
            else if (remainder >= 1000 && remainder <= 4000) {
                remainder -= RomanNumerals.M.romanValue;
                romanString = romanString.concat(RomanNumerals.M.toString());
            }
        }
        return romanString;
    }

    public static String intToRoman2(int num) {
        String[] ones = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] hrns = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] ths ={"","M","MM","MMM"};

        return ths[num/1000] + hrns[(num%1000)/100] + tens[(num%100)/10] + ones[num%10];
    }
}

