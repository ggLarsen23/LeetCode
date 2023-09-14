import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        LeetCodeEasyPart1 leetCodeEasyPart1 = new LeetCodeEasyPart1();

        int[] input = {1, 2, 3, 4, 5};
        int[] output = leetCodeEasyPart1.runningSum(input);

        System.out.println("System Output: " + Arrays.toString(output));
    }
}