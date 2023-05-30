import java.util.Stack;

public class NeetCode03_Stack {

    /** 20. Valid Parentheses */
    public static boolean isValidStack(String s) {

        if (s.isEmpty()) {return false; }

        Stack<Character> parenthesesStack = new Stack<>();

        for (Character c : s.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                parenthesesStack.push(c);
            }

            else if(parenthesesStack.empty()) { return false; }

            else if(c == ')' && parenthesesStack.peek() == '('  ) {
                parenthesesStack.pop();
            }
            else if(c == '}' && parenthesesStack.peek() == '{'  ) {
                parenthesesStack.pop();
            }
            else if(c == ']' && parenthesesStack.peek() == '['  ) {
                parenthesesStack.pop();
            }
            else return false;
        }

        return parenthesesStack.isEmpty();
    }
}
