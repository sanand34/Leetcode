import java.util.*;
class Solution {
    public HashMap<Integer,Boolean> hmp=new HashMap<>();
    public boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
             if(!hmp.containsKey(nums[i])) {
                 hmp.put(nums[i],true);
             }else {
                 if(hmp.get(nums[i])) return true;
                 else
                     hmp.put(nums[i],false);
             }
            
        }
        return false;
       
    }
}