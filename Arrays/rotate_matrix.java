// You are given a n x n 2D matrix A representing an image.

// Rotate the image by 90 degrees (clockwise).

// You need to do this in place.

// Note: If you end up using an additional array, you will only receive partial score.

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {
        
        int n = A.length;
        //Transpose of Matrix
        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;

            }
        }
    }
}