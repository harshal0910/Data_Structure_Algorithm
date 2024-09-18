// You are given an integer array A of length N.
// You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
// For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
// More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.


public class Solution{
  public long[] rangeSum(int[] A,int[][] B){
    long[] ans = new long[B.length];
    int N = A.length;
    int prefSum = new int[N];
    for(int i=1;i<N;i++){
      prefSum[i] = prefSum[i-1] + A[i];
    }

    for(int i=0; i<B.length;i++){
      int L = B[i][0];
      int R = B[i][1];

      if(L==0){
        ans[i]=prefSum[R];
      }
      else{
        ans[i] = prefSum[R] - prefSum[L];
      }
    }
    return ans;
  }
