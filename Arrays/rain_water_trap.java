// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

// Example 1:




// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.


// Example 2:

// Input: height = [4,2,0,3,2,5]
// Output: 9


class Solution {
    public int trap(int[] height) {

        int n = height.length;

        int pfMax[] = new int[n];
        int sfMax[] = new int[n];

        pfMax[0] = height[0];
        sfMax[n-1] = height[n-1];

        for(int i=1;i<n;i++){
            pfMax[i] = Math.max(pfMax[i-1],height[i]);
        }

        for(int i=n-2;i>=0;i--){
            sfMax[i] = Math.max(sfMax[i+1],height[i]);
        }
        int ans = 0;
        for(int i=1;i<n-1;i++){
            int maxL = pfMax[i-1];
            int maxR = pfMax[i+1];
            int water = Math.min(maxL,maxR)-height[i];

            if(water>0){
                ans += water;
            }

        }
        return ans;
    }
}