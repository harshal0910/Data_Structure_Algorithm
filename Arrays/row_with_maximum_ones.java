// Given a m x n binary matrix mat, find the 0-indexed position of the row that contains the maximum count of ones, and the number of ones in that row.

// In case there are multiple rows that have the maximum count of ones, the row with the smallest row number should be selected.

// Return an array containing the index of the row, and the number of ones in it.

 

// Example 1:

// Input: mat = [[0,1],[1,0]]
// Output: [0,1]
// Explanation: Both rows have the same number of 1's. So we return the index of the smaller row, 0, and the maximum count of ones (1). So, the answer is [0,1]. 
// Example 2:

// Input: mat = [[0,0,0],[0,1,1]]
// Output: [1,2]
// Explanation: The row indexed 1 has the maximum count of ones (2). So we return its index, 1, and the count. So, the answer is [1,2].
// Example 3:

// Input: mat = [[0,0],[1,1],[0,0]]
// Output: [1,2]
// Explanation: The row indexed 1 has the maximum count of ones (2). So the answer is [1,2].
 

// Constraints:

// m == mat.length 
// n == mat[i].length 
// 1 <= m, n <= 100 
// mat[i][j] is either 0 or 1.

import java.util.Arrays;

class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        // Step 1: Sort each row so that all 0s come before 1s
        for (int[] row : mat) {
            Arrays.sort(row);
        }

        int[] ans = new int[2]; // ans[0] = row index, ans[1] = max ones
        int maxCount = 0;

        // Step 2: Top-right corner traversal
        int i = 0, j = cols - 1;
        while (i < rows && j >= 0) {
            if (mat[i][j] == 1) {
                int onesInRow = cols - j; // ones so far in this row
                if (onesInRow > maxCount) {
                    maxCount = onesInRow;
                    ans[0] = i;
                    ans[1] = maxCount;
                }
                j--; // move left
            } else {
                i++; // move down
            }
        }

        return ans;
    }
}
