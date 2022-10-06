class Solution {
    int print2largest(int arr[], int n) {
      int max=0;
        int smax=-1;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                smax= max;
                max =arr[i];
               }
            else{
                smax=-1;
            }
        }
        for(int i=0;i<n;i++){
            if(smax<arr[i] && max>arr[i]){
                smax = arr[i];
            }
        }
        return smax;
    }
}

        
    

            
            
       
           
        
        
    
