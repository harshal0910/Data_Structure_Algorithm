// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

 

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]
 

// Constraints:

// 2 <= nums.length <= 104
// -109 <= nums[i] <= 109
// -109 <= target <= 109
// Only one valid answer exists.


class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}



// Using Two Pointers
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[][] arr = new int[n][2];

        // Step 1: Store each number with its original index
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];  // value
            arr[i][1] = i;        // original index
        }

        // Step 2: Sort by value (not index)
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        // Step 3: Apply two-pointer technique
        int i = 0;
        int j = n - 1;

        while (i < j) {
            int sum = arr[i][0] + arr[j][0];

            if (sum == target) {
                // Return original indices
                return new int[] {arr[i][1], arr[j][1]};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        // Step 4: No solution (shouldn't happen as per problem guarantee)
        return new int[] {};
    }
}
