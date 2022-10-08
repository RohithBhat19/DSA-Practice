class Solution{
  static long trappingWater(int arr[], int n) { 
        long ans = 0;
        int leftMax = 0;
        int rightMax = 0;
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            if(arr[l]<=arr[r]){
                if(arr[l]>leftMax) leftMax = arr[l];
                else ans+=(leftMax-arr[l]);
                l++;
            }else{
                if(arr[r]>rightMax) rightMax = arr[r];
                else ans+= (rightMax-arr[r]);
                r--;
            }
        }
        return ans;
    } 
}
    
    
    
