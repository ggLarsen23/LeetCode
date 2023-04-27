import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeetSolutionsMedium {

    //Longets Palindrome O(n^3)
    public static String longestPalindromeSubstring(String s) {
        List<Character> charList = IntStream.range(0, s.length())
                .mapToObj(s::charAt)
                .collect(Collectors.toList());

        List<Character> matchList = new ArrayList<Character>();
        List<Character> largestPalindromeList = new ArrayList<Character>();

        for(int i = 0; i < s.length(); i++) {
             matchList.add(charList.get(i));

             int size = matchList.size();
             List<Character> tmpMatchList = new ArrayList<>(matchList);
             for (int j = 0; !isPalindrome(tmpMatchList) && j < size; j++) {
                 tmpMatchList.remove(0);
             }

             if(isPalindrome(tmpMatchList) && tmpMatchList.size() > largestPalindromeList.size()){
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

        if(characterList.size() == 0) {
            return false;
        }

        List<Character> backwardsList = new ArrayList<>();
        for (int i = characterList.size() - 1; i >= 0; i--) {
            backwardsList.add(characterList.get(i));
        }

        return characterList.equals(backwardsList);
    }

    /*public static Boolean isPalindrome(List<Character> characterList) {

        int listSize = characterList.size();
        int middle = listSize / 2;
        int startingIndex = 0;


        if (listSize == 0) {
            return false;
        }
        //Middle rounded down if even
        else if (listSize % 2 == 0) {
            startingIndex = (int) Math.floor(middle) - 1;
        }
        //Middle if odd
        else {
            startingIndex = middle + 1;
        }

        List<Character> left = new ArrayList<>();
        List<Character> right = new ArrayList<>();
        for(int i = 1; i <= (listSize / 2 + 1) - 1; i++) {
            left.add(characterList.get(startingIndex - i - 1));
            right.add(characterList.get(startingIndex + i - 1));
        }

        return left.equals(right);
    }*/
}
