class Compute {
    
    public int largest(int arr[], int n)
    {
        int max = 0;
       
        for(int i= 1;i<n;i++){
            
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return arr[max];
    }
}
   
