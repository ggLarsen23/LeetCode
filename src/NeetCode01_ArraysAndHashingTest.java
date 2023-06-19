import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NeetCode01_ArraysAndHashingTest {

    @Test
    void groupAnagrams() {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("eat","tea","ate"));
        expected.add(Arrays.asList("bat"));
        expected.add(Arrays.asList("tan","nat"));

        NeetCode01_ArraysAndHashing neetCodeArraysAndHashing = new NeetCode01_ArraysAndHashing();

        List<List<String>> output = neetCodeArraysAndHashing.groupAnagrams(strs);
        assertEquals(expected, output);
    }

    @Test
    void topKFrequent() {
        int[] inputArray = new int[]{1,1,1,2,2,3};
        int inputK = 2;

        NeetCode01_ArraysAndHashing neetCodeArraysAndHashing = new NeetCode01_ArraysAndHashing();

        int[] output = neetCodeArraysAndHashing.topKFrequent(inputArray, inputK);
        assertTrue(Arrays.equals(new int[]{1,2}, output));

        int[] inputArray2 = new int[]{1,1,1,2,2,3,3,3,3,1,1,1,4,4,5,5,6,6,6};
        int inputK2 = 3;

        int[] output2 = neetCodeArraysAndHashing.topKFrequent(inputArray2, inputK2);
        assertTrue(Arrays.equals(new int[]{1,3,6}, output2));
    }

    @Test
    void productExceptSelfTest() {
        int[] inputArray = new int[]{1,2,3,4};

        NeetCode01_ArraysAndHashing neetCode01ArraysAndHashing = new NeetCode01_ArraysAndHashing();

        int[] output = neetCode01ArraysAndHashing.productExceptSelf2(inputArray);

        int[] expected = new int[]{24,12,8,6};
        assertTrue(Arrays.equals(expected, output));
    }
}