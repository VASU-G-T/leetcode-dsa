class Solution {
    public int[] buildArray(int[] nums) {
        int[] s=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            s[i]=nums[nums[i]];
        }

return s;
    }
}