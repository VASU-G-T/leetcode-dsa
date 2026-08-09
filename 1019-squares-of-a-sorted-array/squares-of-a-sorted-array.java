class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] n=new int[nums.length];
          for(int l=0;l<n.length;l++){
            n[l]=nums[l]*nums[l];
         }
         for(int l=0;l<n.length;l++){
            int m=l;
            for(int j=l+1;j<n.length;j++){
                if (n[j]<n[m]){                                 
                     m=j;
                     
                }
                
            }
            int t=n[l];
                n[l]=n[m];
                n[m]=t;
         }
            
            
         return n;
    }
}