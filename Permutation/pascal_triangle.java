
// Topics
// premium lock icon
// Companies
// Given an integer numRows, return the first numRows of Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

// Example 1:

// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// Example 2:

// Input: numRows = 1
// Output: [[1]]

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> triangle = new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer> currRow = new ArrayList<>();

            for(int j=0;j<=i;j++){
                if(j==0||i==j){
                    currRow.add(1);
                }
                else{
                    int val = triangle.get(i-1).get(j) + triangle.get(i-1).get(j-1);
                    currRow.add(val);    
                }
            }
            triangle.add(currRow);
        }
        return triangle;
    }
}