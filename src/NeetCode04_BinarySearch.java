public class NeetCode04_BinarySearch {

    /**
     * 704. Binary Search, O(n*log(n))
     */
    public int binarySearch(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int center = left + (right - left) / 2;
            if (nums[center] == target) {
                return center;
            }
            else if(nums[center] < target) {
                left = center + 1;
            }
            else if(nums[center] > target) {
                right = center - 1;
            }
        }
        return -1;
    }
}
