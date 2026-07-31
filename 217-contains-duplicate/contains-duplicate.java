import java.util.HashSet;
import java.util.Set;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s1= new HashSet<>();
        for(int x :nums){
           if (!s1.contains(x)){
        s1.add(x);
           }
        }
           if(nums.length!=s1.size()){
                    return true;
                }else{
                    return false;
                }
            }
            
        }
         
    
    
