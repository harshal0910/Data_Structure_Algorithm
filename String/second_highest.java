// Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.

// An alphanumeric string is a string consisting of lowercase English letters and digits.

 

// Example 1:

// Input: s = "dfa12321afd"
// Output: 2
// Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.





class Solution {
    public int secondHighest(String s) {
        // Create an array to track seen digits
        boolean[] digits = new boolean[10];

        // Mark which digits appear in the string
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits[ch - '0'] = true;
            }
        }

        // Find the two largest digits
        int count = 0;
        for (int i = 9; i >= 0; i--) {
            if (digits[i]) {
                count++;
                if (count == 2) {
                    return i; // second largest
                }
            }
        }

        // If less than two digits found
        return -1;
    }
}
