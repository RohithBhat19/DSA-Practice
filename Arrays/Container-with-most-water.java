class Solve{
    
    long maxArea(int A[], int len){
        int maxArea = 0;
        int l = 0;
        int r = A.length-1;
        while(l<r){
            int height = Math.min(A[l],A[r]);
            int distance = r-l;
            int area = height*distance;
            maxArea = Math.max(maxArea,area);
            if(A[l]<A[r]){
                l++;
            }else{
                r--;
            }
        }
            return maxArea;
        }
        
    }
    
