import java.util.*;
class Solution {

    public int majorityElement(int[] nums) {
        Map<Integer,Integer>m1=new HashMap<>();
        for (int x:nums){
            m1.put(x,m1.getOrDefault(x,0)+1);

        }
        for(int x:m1.keySet()){
            if(m1.get(x)>nums.length/2){
                return x;
                
            }
        }
        return 0;
    }
}
