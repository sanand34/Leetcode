import java.util.*;
class Solution {
    HashMap<Integer,Integer> hmp=new HashMap<>();
    public int rob(int[] nums) {
        return Math.max(house_rob(nums,0),house_rob(nums,1));
    }
    public int house_rob(int[] houses,int house){
        if(houses.length==1) return houses[0];
        if(hmp.get(house)!=null) return hmp.get(house);
        if((house+2)==houses.length-1)  
        {
            hmp.put(house,houses[house]+house_rob(houses,house+2));
            return hmp.get(house);
        }
        if((house+3)>=houses.length)  return houses[house];
       
        hmp.put(house,Math.max(houses[house]+house_rob(houses,house+2),houses[house]+house_rob(houses,house+3)));
        return hmp.get(house);
    }
}