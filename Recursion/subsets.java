// Given an integer array nums of unique elements, return all possible subsets (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.

 

// Example 1:

// Input: nums = [1,2,3]
// Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
// Example 2:

// Input: nums = [0]
// Output: [[],[0]]
 

// Constraints:

// 1 <= nums.length <= 10
// -10 <= nums[i] <= 10
// All the numbers of nums are unique.

// Solution 1
class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums,result,new ArrayList<>(),0);
        return result;
        
    }


    public void backtrack(int[] nums,List<List<Integer>> result,List<Integer> current,int idx){
        if(idx==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[idx]);
        backtrack(nums,result,current,idx+1);
        current.remove(current.size()-1);
        backtrack(nums,result,current,idx+1);
    }
}


// Solution 2
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        // Add current subset to result
        result.add(new ArrayList<>(current));

        // Explore further elements
        for (int i = index; i < nums.length; i++) {
            // Include nums[i]
            current.add(nums[i]);
            
            // Recurse
            backtrack(i + 1, nums, current, result);
            
            // Backtrack (remove the last element)
            current.remove(current.size() - 1);
        }
    }
}
