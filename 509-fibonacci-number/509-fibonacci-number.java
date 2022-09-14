import java.util.*;
class Solution {
    public HashMap<Integer,Integer> hmp=new HashMap<>();
    public int fib(int n) {
        if(n<1) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        if(hmp.get(n)!=null) return hmp.get(n);
        hmp.put(n,fib(n-1)+fib(n-2));
        return hmp.get(n);
        
    }
}