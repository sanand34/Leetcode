import java.util.*;
class Solution {
    public Set<Integer> hs=new HashSet<>();
    public boolean isHappy(int n) {
     
        while(n>=3 && !hs.contains(n)){
            hs.add(n);
            int num=n;
            int temp=0;
            while(num>0){
                temp+=(num%10)*(num%10);
                num=num/10;
            }

            n=temp;
        }
        if(n==1) return true;
        else return false;
    }
}