// Given an integer array nums, find the subarray with the largest sum, and return its sum.

 

// Example 1:

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.
// Example 2:

// Input: nums = [1]
// Output: 1
// Explanation: The subarray [1] has the largest sum 1.
// Example 3:

// Input: nums = [5,4,-1,7,8]
// Output: 23
// Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 

// Constraints:

// 1 <= nums.length <= 105
// -104 <= nums[i] <= 104


//Using Prefix Sum
// class Solution {
//     public int maxSubArray(int[] nums) {

//         int[] prefixSum = new int[nums.length];
//         prefixSum[0] = nums[0];
//         for(int i=1;i<nums.length;i++){
//             prefixSum[i] = prefixSum[i-1] + nums[i];
//         }
//         int ans = Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
            
//             for(int j=i;j<nums.length;j++){
//                 int sum;
//                 if(i==0){
//                     sum = prefixSum[j];
//                 }
//                 else{
//                     sum = prefixSum[j] - prefixSum[i-1]; 
//                 }
//                 ans = Math.max(ans,sum);
                 
//             }

            
//         }

//         return ans;
//     }
// }

class Solution {
    public int maxSubArray(int[] nums) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            currSum += nums[i];

            if(currSum>maxSum){
                maxSum = currSum;
            }

            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }
}