import java.util.*;

public class NeetCode_ArraysAndHashing {

    /** O(n*k log(k)) */
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

    /** O(n log(m)) */
    public int[] topKFrequent(int[] nums, int k) {

        int[] numsArray = new int[k];
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for (int number : nums) {
            numsMap.put(number, numsMap.getOrDefault(number, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> mapList = new ArrayList<>(numsMap.entrySet());

        Collections.sort(mapList, (a,b) -> (b.getValue() - a.getValue()));

        for(int i = 0; i < k; i++) {
            numsArray[i] = mapList.get(i).getKey();
        }

        return numsArray;
    }
}
