// 22. Generate Parentheses
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

// Example 1:

// Input: n = 3
// Output: ["((()))","(()())","(())()","()(())","()()()"]
// Example 2:

// Input: n = 1
// Output: ["()"]
 

// Constraints:

// 1 <= n <= 8


class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();
        backtrack(n,ans,"",0,0);
        return ans;
        
    }

    public void backtrack(int n,List<String> ans,String str,int opn_br,int close_br){
        if(str.length()==2*n){
            ans.add(str);
            return;
        }
        if(opn_br<n){
            backtrack(n,ans,str+"(",opn_br+1,close_br);

        }
        if(close_br<opn_br){
            backtrack(n,ans,str+")",opn_br,close_br+1);
        }

    }
}