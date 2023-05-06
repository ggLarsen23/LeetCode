import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCodeMediumPart1Test {

    @Test
    void longestPalindromeSubstringTest() {
        String inputString = "cbbdddby";
        String output = LeetCodeMediumPart1.longestPalindromeSubstring(inputString);
        assertEquals(output, "bdddb");

        String inputString2 = "babad";
        String output2 = LeetCodeMediumPart1.longestPalindromeSubstring(inputString2);
        assertEquals(output2, "bab");

        String inputString3 = "";
        String output3 = LeetCodeMediumPart1.longestPalindromeSubstring(inputString3);
        assertEquals(output3, "");

        String inputString4 = "jrjnbctoqgzimtoklkxcknwmhiztomaofwwzjnhrijwkgmwwuazcowskjhitejnvtblqyepxispas" +
                "rgvgzqlvrmvhxusiqqzzibcyhpnruhrgbzsmlsuacwptmzxuewnjzmwxbdzqyvsjzxiecsnkdibudtvthzlizralpaows" +
                "bakzconeuwwpsqynaxqmgngzpovauxsqgypinywwtmekzhhlzaeatbzryreuttgwfqmmpeywtvpssznkwhzuqewuqtfuf" +
                "lttjcxrhwexvtxjihunpywerkktbvlsyomkxuwrqqmbmzjbfytdddnkasmdyukawrzrnhdmaefzltddipcrhuchvdcoeg" +
                "amlfifzistnplqabtazunlelslicrkuuhosoyduhootlwsbtxautewkvnvlbtixkmxhngidxecehslqjpcdrtlqswmygh" +
                "mwlttjecvbueswsixoxmymcepbmuwtzanmvujmalyghzkvtoxynyusbpzpolaplsgrunpfgdbbtvtkahqmmlbxzcfznvh" +
                "xsiytlsxmmtqiudyjlnbkzvtbqdsknsrknsykqzucevgmmcoanilsyyklpbxqosoquolvytefhvozwtwcrmbnyijbamml" +
                "zrgalrymyfpysbqpjwzirsfknnyseiujadovngogvptphuyzkrwgjqwdhtvgxnmxuheofplizpxijfytfabx";
        String output4 = LeetCodeMediumPart1.longestPalindromeSubstring(inputString4);
        assertEquals(output4, "qosoq");
    }

    @Test
    void isPallindromeTest() {
        List<Character> inputTrue = Arrays.asList('k','o','t','o','k');
        Boolean outputTrue = LeetCodeMediumPart1.isPalindrome(inputTrue);
        assertEquals(true, outputTrue);

        List<Character> inputFalse = Arrays.asList('t','o','t','o','k');
        Boolean outputFalse = LeetCodeMediumPart1.isPalindrome(inputFalse);
        assertEquals(false, outputFalse);

        List<Character> inputTrueEven = Arrays.asList('k','o','t', 't','o','k');
        Boolean outputTrueEven = LeetCodeMediumPart1.isPalindrome(inputTrueEven);
        assertEquals(true, outputTrueEven);

        List<Character> inputFalseEven = Arrays.asList('k','p','t', 't','o','k');
        Boolean outputFalseEven = LeetCodeMediumPart1.isPalindrome(inputFalseEven);
        assertEquals(false, outputFalseEven);

        List<Character> inputZero = Arrays.asList();
        Boolean outputZero = LeetCodeMediumPart1.isPalindrome(inputZero);
        assertEquals(false, outputZero);
    }
}