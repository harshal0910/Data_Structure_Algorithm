// There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

// You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

 

// Example 1:

// Input: gain = [-5,1,5,0,-7]
// Output: 1
// Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

class Solution {
    public int largestAltitude(int[] gain) {

        int arr[] = new int[gain.length+1];

        arr[0] = 0;
        arr[1] = gain[0];
        int ans = gain[0];
        for(int i=1;i<gain.length;i++){
            arr[i+1] = gain[i] + arr[i];

            if(arr[i+1]>ans){
                ans = arr[i+1];
            }
        }
        if(ans<0){
            return 0;
        }
        
        return ans;

    }
}