class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] temp=new int[nums.length];

        for(int j=0;j<temp.length;j++){
            temp[j]=nums[j]*nums[j];
        }

        Arrays.sort(temp);


        return temp;
    }

    // public static void quickSort(int []temp,int left,int right){
        
    //     if(left>=right){
    //         return;
    //     }
    //     int i=0;
    //     int k=right;
    //     while(i<k){
    //         while(i<=right&&temp[i]<=temp[left]){
    //         i++;
    //     }
    //         while(temp[k]>temp[left]){
    //         k--;
    //     }
    //         if(i<k){
    //             int var=temp[i];
    //             temp[i]=temp[k];
    //             temp[k]=var;
    //         }
    //     }
    //     int var=temp[i];
    //     temp[i]=temp[k];
    //     temp[k]=var;
    //     quickSort(temp,left,k-1);
    //     quickSort(temp,k+1,right);
    // }
}
