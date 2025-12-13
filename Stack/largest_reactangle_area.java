// Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.



class Solution {
    public int largestRectangleArea(int[] A) {

        int m = A.length;

        // Here we are creating an array of Nearest Smaller Element to the LEFT;
        int[] leftIndex = new int[m];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<m; i++){
            while(!stack.isEmpty() && A[i]<=A[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                leftIndex[i] = -1;
            }
            else{
                leftIndex[i] = stack.peek();
            }
            stack.push(i);
        }

        // Here we are creating an array of Nearest Smaller Element to the RIGHT;
        int[] rightIndex = new int[m];
        Stack<Integer> stack1 = new Stack<>();
        for(int i = m-1; i>=0; i--){
            while(!stack1.isEmpty() && A[i]<=A[stack1.peek()]){
                stack1.pop();
            }
            if(stack1.isEmpty()){
                rightIndex[i] = m;
            }
            else{
                rightIndex[i] = stack1.peek();
            }
            stack1.push(i);
        }

        int largestRectangleArea = 0;
        for(int i = 0; i<m; i++){
            int area = A[i] * (rightIndex[i] - leftIndex[i] - 1);
            largestRectangleArea = Math.max(largestRectangleArea, area);
        }
        return largestRectangleArea;

        // T.C = O(m) & S.C = O(m);
        
    }
}