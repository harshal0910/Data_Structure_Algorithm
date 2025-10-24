// Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

// Return the minimized largest sum of the split.

// A subarray is a contiguous part of the array.

 

// Example 1:

// Input: nums = [7,2,5,10,8], k = 2
// Output: 18
// Explanation: There are four ways to split nums into two subarrays.
// The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
// Example 2:

// Input: nums = [1,2,3,4,5], k = 2
// Output: 9
// Explanation: There are four ways to split nums into two subarrays.
// The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.
 

// Constraints:

// 1 <= nums.length <= 1000
// 0 <= nums[i] <= 106
// 1 <= k <= min(50, nums.length)

class Solution {
    // Check if we can split nums into <= k subarrays with each sum <= mid
    public boolean check(int nums[], int k, int mid) {
        int painters = 1; // current number of painters/subarrays
        int currentSum = 0;

        for (int num : nums) {
            if (currentSum + num > mid) {
                painters++;          // need a new painter
                currentSum = num;    // start new subarray
                if (painters > k) return false; // too many painters needed
            } else {
                currentSum += num;
            }
        }
        return true; // possible with <= k painters
    }

    public int splitArray(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int total_sum = 0;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            total_sum += nums[i];
        }

        int lo = max;
        int hi = total_sum;
        int ans = hi;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (check(nums, k, mid)) {
                ans = mid;    // possible, try smaller max sum
                hi = mid - 1;
            } else {
                lo = mid + 1; // not possible, need bigger sum
            }
        }

        return ans;
    }
}
