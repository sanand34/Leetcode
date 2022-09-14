import java.util.*;
class Solution {
    public HashMap<Integer,Integer> hmp=new HashMap<>();
    public int climbStairs(int n) {
        if(n<1) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        if(hmp.get(n)!=null) return hmp.get(n);
        hmp.put(n,climbStairs(n-1)+climbStairs(n-2));
        return hmp.get(n);
    }
}