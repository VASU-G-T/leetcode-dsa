class Solution {
    public int hammingWeight(int b) {
      
              int count=0;
        
        while(b>0){
            count += b&1;
            b= b>>1;
           
        }
        return count;
    }
}