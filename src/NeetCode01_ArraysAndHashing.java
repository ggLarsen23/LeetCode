import java.util.*;

public class NeetCode01_ArraysAndHashing {

    /** 49. Group Anagrams, O(n*k log(k)) */
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> groups = new HashMap<>();

        for (String word: strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            if (!groups.containsKey(key)) {
                groups.put(key, new ArrayList<>());
            }

            groups.get(key).add(word);
        }

        // List<values>. values = List<String>
        return new ArrayList<>(groups.values());
    }

    /** 347. Top K Frequent Elements, O(n * m log(m)) */
    public int[] topKFrequent(int[] nums, int k) {

        int[] numsArray = new int[k];
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for (int number : nums) {
            numsMap.put(number, numsMap.getOrDefault(number, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> mapList = new ArrayList<>(numsMap.entrySet());

        mapList.sort((a, b) -> (b.getValue() - a.getValue()));

        for(int i = 0; i < k; i++) {
            numsArray[i] = mapList.get(i).getKey();
        }

        return numsArray;
    }

    /** 238. Product of Array Except Self, O(n^2) */
     public int[] productExceptSelf(int[] nums) {

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if(i != j) {
                    product *= nums[j];
                }
            }
            ans[i] = product;
        }
        return ans;
    }

    /** 238. Product of Array Except Self, O(n) */
    public int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = 1;
        suffix[n - 1] = 1;

        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        for(int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            ans[i] = prefix[i] * suffix[i];
        }
        return ans;
    }
}
