// Given an integer n, return true if it is a power of four. Otherwise, return false.

// An integer n is a power of four, if there exists an integer x such that n == 4x.

 

// Example 1:

// Input: n = 16
// Output: true
// Example 2:

// Input: n = 5
// Output: false
// Example 3:

// Input: n = 1
// Output: true
 

// Constraints:

// -231 <= n <= 231 - 1


class Solution {
    public boolean isPowerOfFour(int n) {
        // Must be positive
        if (n <= 0) return false;
        
        // Check if it's a power of 2: only one bit should be set
        if ((n & (n - 1)) != 0) return false;
        
        // Check if the only set bit is at an even position (0-based)
        // 0x55555555 = 01010101010101010101010101010101 in binary
        // It has 1s at all even positions.
        if ((n & 0x55555555) == 0) return false;
        
        return true;
    }
}
