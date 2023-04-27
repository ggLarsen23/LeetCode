import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetSolutionsMediumTest {

    @Test
    void longestPalindromeSubstringTest() {
        String inputString = "cbbdddby";
        String output = LeetSolutionsMedium.longestPalindromeSubstring(inputString);
        assertEquals(output, "bdddb");

        String inputString2 = "babad";
        String output2 = LeetSolutionsMedium.longestPalindromeSubstring(inputString2);
        assertEquals(output2, "bab");

        String inputString3 = "";
        String output3 = LeetSolutionsMedium.longestPalindromeSubstring(inputString3);
        assertEquals(output3, "");

        String inputString4 = "jrjnbctoqgzimtoklkxcknwmhiztomaofwwzjnhrijwkgmwwuazcowskjhitejnvtblqyepxispas" +
                "rgvgzqlvrmvhxusiqqzzibcyhpnruhrgbzsmlsuacwptmzxuewnjzmwxbdzqyvsjzxiecsnkdibudtvthzlizralpaows" +
                "bakzconeuwwpsqynaxqmgngzpovauxsqgypinywwtmekzhhlzaeatbzryreuttgwfqmmpeywtvpssznkwhzuqewuqtfuf" +
                "lttjcxrhwexvtxjihunpywerkktbvlsyomkxuwrqqmbmzjbfytdddnkasmdyukawrzrnhdmaefzltddipcrhuchvdcoeg" +
                "amlfifzistnplqabtazunlelslicrkuuhosoyduhootlwsbtxautewkvnvlbtixkmxhngidxecehslqjpcdrtlqswmygh" +
                "mwlttjecvbueswsixoxmymcepbmuwtzanmvujmalyghzkvtoxynyusbpzpolaplsgrunpfgdbbtvtkahqmmlbxzcfznvh" +
                "xsiytlsxmmtqiudyjlnbkzvtbqdsknsrknsykqzucevgmmcoanilsyyklpbxqosoquolvytefhvozwtwcrmbnyijbamml" +
                "zrgalrymyfpysbqpjwzirsfknnyseiujadovngogvptphuyzkrwgjqwdhtvgxnmxuheofplizpxijfytfabx";
        String output4 = LeetSolutionsMedium.longestPalindromeSubstring(inputString4);
        assertEquals(output4, "qosoq");
    }

    @Test
    void isPallindromeTest() {
        List<Character> inputTrue = Arrays.asList('k','o','t','o','k');
        Boolean outputTrue = LeetSolutionsMedium.isPalindrome(inputTrue);
        assertEquals(true, outputTrue);

        List<Character> inputFalse = Arrays.asList('t','o','t','o','k');
        Boolean outputFalse = LeetSolutionsMedium.isPalindrome(inputFalse);
        assertEquals(false, outputFalse);

        List<Character> inputTrueEven = Arrays.asList('k','o','t', 't','o','k');
        Boolean outputTrueEven = LeetSolutionsMedium.isPalindrome(inputTrueEven);
        assertEquals(true, outputTrueEven);

        List<Character> inputFalseEven = Arrays.asList('k','p','t', 't','o','k');
        Boolean outputFalseEven = LeetSolutionsMedium.isPalindrome(inputFalseEven);
        assertEquals(false, outputFalseEven);

        List<Character> inputZero = Arrays.asList();
        Boolean outputZero = LeetSolutionsMedium.isPalindrome(inputZero);
        assertEquals(false, outputZero);
    }
}