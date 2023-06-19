import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NeetCode02_TwoPointersTest {

    @Test
    void isPalindrome() {
        Boolean outputTrue = NeetCode02_TwoPointers.isPalindrome("otto");
        assertEquals(true, outputTrue);

        Boolean outputTrue2 = NeetCode02_TwoPointers.isPalindrome("notapallindrome");
        assertEquals(false, outputTrue2);

        Boolean outputTrue3 = NeetCode02_TwoPointers.isPalindrome("");
        assertEquals(false, outputTrue3);

        Boolean outputTrue4 = NeetCode02_TwoPointers.isPalindrome("txt");
        assertEquals(true, outputTrue4);

        Boolean outputTrue5 = NeetCode02_TwoPointers.isPalindrome(null);
        assertEquals(false, outputTrue5);

        Boolean outputTrue6 = NeetCode02_TwoPointers.isPalindrome("A man, a plan, a canal: Panama");
        assertEquals(true, outputTrue6);

        Boolean outputTrue7 = NeetCode02_TwoPointers.isPalindrome("0P");
        assertEquals(false, outputTrue7);

        System.out.println("All tests are Bueno");
    }

    @Test
    void twosumFirstTest() {
        int[] output = NeetCode02_TwoPointers.twoSumFirst(new int[]{2, 7, 11, 15}, 9);
        assertTrue(Arrays.equals(output, new int[]{0, 1}));
    }

    @Test
    void twosumTest() {
        int[] output = NeetCode02_TwoPointers.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertTrue(Arrays.equals(output, new int[]{1, 2}));
    }

    @Test
    void twoSumSorted2() {
        int[] output = NeetCode02_TwoPointers.twoSumSorted2(new int[]{2, 7, 11, 15}, 9);
        assertTrue(Arrays.equals(output, new int[]{1, 2}));
    }
    @Test
    void threeSumTest() {
        int[] inputArray = new int[]{0,0,0};

        NeetCode02_TwoPointers neetCode02TwoPointers = new NeetCode02_TwoPointers();

        List<List<Integer>> output = neetCode02TwoPointers.threeSum(inputArray);

        List<Integer> list1 = new ArrayList<>(Arrays.asList(0,0,0));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(-1,0,1));
        List<List<Integer>> expected = new LinkedList<>(Arrays.asList(list1, list2));
        assertTrue(Arrays.equals(list1.toArray(), (output.get(0).toArray())));
    }
}