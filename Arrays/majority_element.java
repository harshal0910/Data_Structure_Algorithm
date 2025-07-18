// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2


class Solution {
    public int majorityElement(int[] nums) {

        int majEle = nums[0];
        int count = 1;

        for(int i=1;i<nums.length;i++){
            if(count==0){
                majEle=nums[i];
                count++;
            }
            else{
                if(majEle==nums[i]){
                    count++;
                }
                else{
                    count--;
                }
            }
        }

        // if(count>nums.length){
        //     return majEle;
        // }
        return majEle;
    }
}