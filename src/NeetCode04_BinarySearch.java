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
                right = mid - 1;
            }
        }
        return false;
    }

}
