class Solution {
    public int[] shuffle(int[] nums, int n) {
     int[] s=new int[2*n]; 
     int index=0;
     for( int i=0;i<n;i++){
        s[index++]=nums[i];
        s[index++]=nums[i+n];
     }

     return s;
    }
}
