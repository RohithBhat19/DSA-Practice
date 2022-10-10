class Solution{
  //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        long cursum = 0;
        long maxsum = arr[0];
        for(int i=0;i<arr.length;i++){
          cursum = cursum+arr[i];
          if(cursum>maxsum){
              maxsum = cursum;
          }
          if(cursum<0){
              cursum = 0;
          }
    }
    return maxsum;
    }
}

    
    
