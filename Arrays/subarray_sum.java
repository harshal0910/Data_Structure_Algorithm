// Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

// A subarray is a contiguous non-empty sequence of elements within an array.

 

// Example 1:

// Input: nums = [1,1,1], k = 2
// Output: 2
// Example 2:

// Input: nums = [1,2,3], k = 3
// Output: 2
 

// Constraints:

// 1 <= nums.length <= 2 * 104
// -1000 <= nums[i] <= 1000
// -107 <= k <= 107


// public class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int n = nums.length;
//         int[] prefix = new int[n + 1];
        
//         // prefix[i] stores the sum of first i elements
//         for (int i = 0; i < n; i++) {
//             prefix[i + 1] = prefix[i] + nums[i];
//         }

//         int count = 0;

//         // Check all subarrays using prefix sums
//         for (int start = 0; start < n; start++) {
//             for (int end = start + 1; end <= n; end++) {
//                 if (prefix[end] - prefix[start] == k) {
//                     count++;
//                 }
//             }
//         }

//         return count;
//     }
// }

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefix = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        for(int i = 0; i<nums.length; i++){
            prefix = prefix + nums[i];
            int other = prefix - k;
            if(hm.containsKey(other)){
                count = count + hm.get(other);
            }
            
            if(hm.containsKey(prefix)){
                hm.put(prefix, hm.get(prefix)+1);
            }
            else{
                hm.put(prefix, 1);
            }
        }
        return count;
    }
}
