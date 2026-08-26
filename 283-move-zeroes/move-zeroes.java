class Solution {
    public void moveZeroes(int[] nums) {

        int[] c = new int[nums.length];
        int j = 0;
      for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                c[j] = nums[i];
                j++;
            }
        }

       
        for (int i = 0; i < nums.length; i++) {
            nums[i] = c[i];
        }
    }
}