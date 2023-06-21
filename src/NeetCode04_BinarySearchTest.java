import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class NeetCode04_BinarySearchTest {

    @Test
    void binarySearch() {
        int[] input = new int[]{-1,0,3,5,9,12};
        NeetCode04_BinarySearch neetCode04BinarySearch = new NeetCode04_BinarySearch();
        int output = neetCode04BinarySearch.binarySearch(input, 2);
        assertEquals(-1, output);
    }

    @Test
    void searchMatrixTest() {
        int[][] input = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        NeetCode04_BinarySearch neetCode04BinarySearch = new NeetCode04_BinarySearch();
        boolean output = neetCode04BinarySearch.searchMatrix(input, 3);
        assertTrue(output);
    }
}