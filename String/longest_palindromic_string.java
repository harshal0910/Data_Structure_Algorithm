// Given a string s, return the longest palindromic substring in s.

 

// Example 1:

// Input: s = "babad"
// Output: "bab"
// Explanation: "aba" is also a valid answer.
// Example 2:

// Input: s = "cbbd"
// Output: "bb"
 

// Constraints:

// 1 <= s.length <= 1000
// s consist of only digits and English letters.

class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int k = 0; k < s.length(); k++) {
            int len1 = expandAroundCenter(s, k, k);
            int len2 = expandAroundCenter(s, k, k + 1);
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = k - (len - 1) / 2;
                end = k + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // return length of the palindrome
        return right - left - 1;
    }
}
