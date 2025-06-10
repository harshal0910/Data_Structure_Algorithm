// Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.

// A good subarray is a subarray where:

// its length is at least two, and
// the sum of the elements of the subarray is a multiple of k.
// Note that:

// A subarray is a contiguous part of the array.
// An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.
 

// Example 1:

// Input: nums = [23,2,4,6,7], k = 6
// Output: true
// Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int[] prefixSum = new int[nums.length + 1];
        prefixSum[0] = 0;

        // Compute prefix sums: prefixSum[i] = sum of first i elements (exclusive)
        for (int i = 1; i <= nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }

        // Try all subarrays of length at least 2
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 2; j <= nums.length; j++) {
                int sum = prefixSum[j] - prefixSum[i];
                if (k == 0) {
                    if (sum == 0) return true;
                } else {
                    if (sum % k == 0) return true;
                }
            }
        }

        return false;
    }
}
