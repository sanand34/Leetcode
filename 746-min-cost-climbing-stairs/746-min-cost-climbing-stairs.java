import java.util.*;
class Solution {
    
    public HashMap<Integer,Integer> hmp=new HashMap<>();

    public int minCostClimbingStairs(int[] cost) {
        return Math.min(stairs(cost,0),stairs(cost,1));
    }
    
        public int stairs(int[]cost,int step){
        if(hmp.get(step)!=null) return hmp.get(step);
        if((step+2)>=cost.length) return cost[step];
        hmp.put(step,Math.min(cost[step]+stairs(cost,step+1),cost[step]+stairs(cost,step+2)));
        return hmp.get(step);
    }
}
