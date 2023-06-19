import java.sql.Array;
import java.util.*;

public class NeetCode02_TwoPointers {

    /**
     * 125. Valid Palindrome,  O(n)
     */
    public static boolean isPalindrome(String s) {

        try {
            if (s.isEmpty()) {
                return false;
            }
        } catch (NullPointerException nullPointerException) {
            System.out.println("Null parameter detected: " + nullPointerException.getMessage());
            return false;
        }

        String onlyLetterString = s.replaceAll("[^A-Za-z0-9]+", "");

        char[] charArray = onlyLetterString.toUpperCase().toCharArray();
        char[] inverseArray = new char[charArray.length];
        int j = 0;

        for (int i = charArray.length - 1; 0 <= i; i--) {
            inverseArray[j] = charArray[i];
            j++;
        }
        return Arrays.equals(charArray, inverseArray);
    }

    /**
     * 1. Two Sum - O(n)
     */
    public static int[] twoSumFirst(int[] numbers, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;

                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return new int[]{-1, -1};
    }

    /**
     * 167. Two Sum II - Input Array Is Sorted, 0(n^2)
     */
    public static int[] twoSum(int[] numbers, int target) {

        int[] result = new int[2];

        for (int i = 0; i <= numbers.length; i++) {

            for (int j = i + 1; j <= numbers.length - 1; j++) {

                if (Math.addExact(numbers[i], numbers[j]) == target) {

                    result[0] = i + 1;
                    result[1] = j + 1;
                    return result;
                }
            }
        }
        return null;
    }

    /**
     * 167. Two Sum II - Input Array Is Sorted, solve it with a Hashmap O(n)
     */

    public static int[] twoSumSorted(int[] numbers, int target) {
        int n = numbers.length;
        HashMap<Integer, Integer> trackMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (trackMap.containsKey(target - numbers[i])) {
                return new int[]{trackMap.get(target - numbers[i]), i + 1};
            }
            trackMap.putIfAbsent(numbers[i], i + 1);
        }
        return new int[]{0};
    }

    /**
     * 167. Two Sum II - Input Array Is Sorted, solved with twoPointers
     */
    public static int[] twoSumSorted2(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0;
        int right = n - 1;

        while (right > left) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else if (numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] twoSumSorted3(int[] numbers, int target) {
        int lenght = numbers.length;
        int leftPointer = 0;
        int rightPointer = lenght;

        while (leftPointer < rightPointer) {
            if ((numbers[leftPointer] + numbers[rightPointer]) < target) {
                leftPointer++;
            } else if ((numbers[leftPointer] + numbers[rightPointer]) > target) {
                rightPointer--;
            } else if ((numbers[leftPointer] + numbers[rightPointer]) == target) {
                return new int[]{leftPointer, rightPointer};
            }
        }
        return null;
    }

    /**
     * 15. 3Sum
     */
    public List<List<Integer>> threeSum(int[] nums) {
        //[-1,0,1,2,-1,-4]
        Arrays.sort(nums);
        LinkedList<List<Integer>> solution = new LinkedList<>();
        int n = nums.length;
        int left = 1;
        int right = n - 1;

        for (int i = 0; i <= n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            left = i + 1;
            right = n - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                } else if (nums[i] + nums[left] + nums[right] == 0) {
                    List<Integer> sol =
                            new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right]));
                    solution.add(sol);
                    left++;
                    while (nums[left] == nums[left - 1] && left < right) {
                        left++;
                    }
                }
            }

        }
        return solution;
    }
}
