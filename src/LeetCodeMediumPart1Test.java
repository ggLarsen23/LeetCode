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

    @Test
    void intToRomanTest() {
        String romanString = LeetCodeMediumPart1.intToRoman(9);
        assertEquals("IX", romanString);

        String romanString2 = LeetCodeMediumPart1.intToRoman(10);
        assertEquals("X", romanString2);

        String romanString3 = LeetCodeMediumPart1.intToRoman(39);
        assertEquals("XXXIX", romanString3);

        String romanString4 = LeetCodeMediumPart1.intToRoman(45);
        assertEquals("XLV", romanString4);

        String romanString5 = LeetCodeMediumPart1.intToRoman(125);
        assertEquals("CXXV", romanString5);

        String romanString6 = LeetCodeMediumPart1.intToRoman(999);
        assertEquals("CMXCIX", romanString6);

        String romanStrin7 = LeetCodeMediumPart1.intToRoman(1994);
        assertEquals("MCMXCIV", romanStrin7);
    }

    @Test
    void intToRomanTest2() {
        String romanString = LeetCodeMediumPart1.intToRoman2(9);
        assertEquals("IX", romanString);

        String romanString2 = LeetCodeMediumPart1.intToRoman2(10);
        assertEquals("X", romanString2);

        String romanString3 = LeetCodeMediumPart1.intToRoman2(39);
        assertEquals("XXXIX", romanString3);

        String romanString4 = LeetCodeMediumPart1.intToRoman2(45);
        assertEquals("XLV", romanString4);

        String romanString5 = LeetCodeMediumPart1.intToRoman2(125);
        assertEquals("CXXV", romanString5);

        String romanString6 = LeetCodeMediumPart1.intToRoman2(999);
        assertEquals("CMXCIX", romanString6);

        String romanStrin7 = LeetCodeMediumPart1.intToRoman2(1994);
        assertEquals("MCMXCIV", romanStrin7);
    }
}