import org.junit.jupiter.api.Test;

import java.util.Arrays;
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
}