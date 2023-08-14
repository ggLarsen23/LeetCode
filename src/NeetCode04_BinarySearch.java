import java.util.Arrays;

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
            } else if (nums[center] < target) {
                left = center + 1;
            } else if (nums[center] > target) {
                right = center - 1;
            }
        }
        return -1;
    }

    /**
     * 74. Search a 2D Matrix, O(log(n) * log(m)
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0;
        int bot = n - 1;
        int left = 0;
        int right = m - 1;
        int correctRow = -1;
        int correctColumn = -1;

        if (n == 1 && m == 1) {
            return matrix[0][0] == target;
        }

        while (top <= bot) {
            int midX = top + (bot - top) / 2;
            if (matrix[midX][0] < target && matrix[midX][m - 1] > target) {
                correctRow = midX;
                break;
            } else if (matrix[midX][0] < target) {
                top = midX + 1;
            } else if (matrix[midX][0] > target) {
                bot = midX - 1;
            }
        }
        if (correctRow == -1) return false;

        while (left <= right) {
            int midY = left + (right - left) / 2;
            if (matrix[correctRow][midY] == target) {
                correctColumn = midY;
                break;
            } else if (matrix[correctRow][midY] < target) {
                left = midY + 1;
            } else if (matrix[correctRow][midY] > target) {
                right = midY - 1;
            }
        }
        if (correctColumn != -1) {
            return true;
        } else return false;
    }

    /**
     * 74. Search a 2D Matrix, O(log(n*m)
     */
    public boolean searchMatrix2(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0;
        int right = n * m - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / m;
            int col = mid % m;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 2;
            }
        }
        return false;
    }

    /**
     * 875. Koko Eating Bananas, O(log(n)
     */
    public int minEatingSpeed(int[] piles, int h) {
        /**
         * [3,6,7,11]  h = 8
         * [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
         * [L           M                  R ]  5 < 8 : output = 5
         * [L  M        R                    ]
         * [   L  M     R                    ]
         * [      L  M  R                    ]
         */
        int left = 0;
        int right = Arrays.stream(piles).max().getAsInt();
        int output = right;

        while (left < right) {
            int mid = left + (right - left) / 2;
            double hoursNeeded = hoursNeededWithSpeed(piles, mid);

            // input k,  returns if possible with k
            if (hoursNeeded <= h) {
                // We can try with a smaller eating speed
                right = mid;
                output = mid; // Update the output if we find a smaller speed that satisfies the condition
            } else {
                // We need a higher eating speed
                left = mid + 1;
            }
        }
        return output;
    }

    public double hoursNeededWithSpeed(int[] piles, int eatingPerHour) {
        double hoursForPiles = 0;
        for (int i = 0; i < piles.length; i++) {
            double hoursTaken = (int) Math.ceil((double) piles[i] / eatingPerHour);

            hoursForPiles += hoursTaken;
        }
        return hoursForPiles;
    }

    /**
     * 153. Find Minimum in Rotated Sorted Array
     */
    public int findMin(int[] nums) {

        /**
         * [4,5,6,7,0,1,2]
         * 7,2
         * 0,1,2
         * 1,2
         * 0,1
         * 0
         */
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = ((left + right) / 2);
            if (nums[right] < nums[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[right];

    }

}
