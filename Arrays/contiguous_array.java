// Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.

 

// Example 1:

// Input: nums = [0,1]
// Output: 2
// Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
// Example 2:

// Input: nums = [0,1,0]
// Output: 2
// Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
// Example 3:

// Input: nums = [0,1,1,1,1,1,0,0,0]
// Output: 6
// Explanation: [1,1,1,0,0,0] is the longest contiguous subarray with equal number of 0 and 1.
 

// Constraints:

// 1 <= nums.length <= 105
// nums[i] is either 0 or 1.


class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // prefix sum = 0 at index -1

        int prefix = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            prefix += (nums[i] == 1 ? 1 : -1);

            if (map.containsKey(prefix)) {
                int len = i - map.get(prefix);
                maxLen = Math.max(maxLen, len);
            } else {
                map.put(prefix, i); // store FIRST occurrence
            }
        }
        return maxLen;
    }
}
