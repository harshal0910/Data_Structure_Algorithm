// Given an array of integers arr of even length n and an integer k.

// We want to divide the array into exactly n / 2 pairs such that the sum of each pair is divisible by k.

// Return true If you can find a way to do that or false otherwise.

 

// Example 1:

// Input: arr = [1,2,3,4,5,10,6,7,8,9], k = 5
// Output: true
// Explanation: Pairs are (1,9),(2,8),(3,7),(4,6) and (5,10).
// Example 2:

// Input: arr = [1,2,3,4,5,6], k = 7
// Output: true
// Explanation: Pairs are (1,6),(2,5) and(3,4).
// Example 3:

// Input: arr = [1,2,3,4,5,6], k = 10
// Output: false
// Explanation: You can try all possible pairs to see that there is no way to divide arr into 3 pairs each with sum divisible by 10.
 

// Constraints:

// arr.length == n
// 1 <= n <= 105
// n is even.
// -109 <= arr[i] <= 109
// 1 <= k <= 105

class Solution {
    public boolean canArrange(int[] arr, int k) {
        long count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : arr) {
            int rem = num % k;
            if (rem < 0) rem += k; // handle negative numbers
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        for (int rem : map.keySet()) {
            int freq = map.get(rem);

            if(rem==0){
                if(freq%2!=0){
                    return false;
                }
            }
            else if(2*rem==k){
                if(freq%2!=0){
                    return false;
                }
            }
            else {
                int complementFreq = map.getOrDefault(k - rem, 0);
                if (freq != complementFreq) return false;
            }
        }

        return true;

    }
}