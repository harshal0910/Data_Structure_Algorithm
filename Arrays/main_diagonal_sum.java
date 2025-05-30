// You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.

// Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.



public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {
        
        int i=0;
        int sum = 0;
        while(i<A.length){
            sum= sum +A[i][i];
            i++;
        }
        return sum;
    }
}