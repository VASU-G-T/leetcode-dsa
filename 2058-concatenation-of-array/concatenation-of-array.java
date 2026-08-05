class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] n= new int[nums.length*2];
        for (int i=0;i<nums.length;i++){
            n[i]=nums[i];
            for (int j=0;j<nums.length;j++){
            n[j+nums.length]=nums[j];
            
        }
        }
        return n;
    }
}