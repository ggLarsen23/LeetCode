import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NeetCode03_StackTest {

    @Test
    void isValidTestStack() {
        boolean output = NeetCode03_Stack.isValidStack("()");
        assertTrue(output);

        boolean output2 = NeetCode03_Stack.isValidStack("([{}])");
        assertTrue(output2);

        boolean output3 = NeetCode03_Stack.isValidStack("()[");
        assertFalse(output3);

        boolean output4 = NeetCode03_Stack.isValidStack("()[]{}}");
        assertFalse(output4);

        boolean output5 = NeetCode03_Stack.isValidStack("(})[");
        assertFalse(output5);

        boolean output6 = NeetCode03_Stack.isValidStack("");
        assertFalse(output6);
    }

    
}
