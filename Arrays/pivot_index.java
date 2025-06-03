// The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

// If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

// Return the leftmost pivot index. If no such index exists, return -1.


// class Solution {
//     public int pivotIndex(int[] nums) {
//         int arr[] = new int[nums.length];
//         int n = nums.length;
//         arr[0] = nums[0];
//         for(int i=1;i<n;i++){
//             arr[i] = arr[i-1] + nums[i];
//         }
//         int idx = -1;
//         for(int i=0;i<n;i++){
//             int leftSum = 0;
//             int rightSum = 0;
//             if(i==0){
//                 rightSum = arr[n-1] - arr[0];
//                 idx = i;
//                 if(leftSum==rightSum){
//                     return idx;
//                 }
//             }
//             else if(i==n-1){
//                 leftSum = arr[n-2] - arr[0];
//                 idx=i;
//                 if(leftSum==rightSum){
//                     return idx;
//                 }
//             }

//             else{
//                 leftSum = arr[i-1] - arr[0];
//                 rightSum = arr[n-1] - arr[i+1];
//                 if(leftSum==rightSum){
//                     idx = i;
//                     return idx;
//                 }
//             }
            

//         }
//         return idx;
//     }
// }

class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            // Right sum is totalSum - leftSum - nums[i]
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}
