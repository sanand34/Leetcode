import java.util.*;
class Solution {
    
    public int uniquePaths(int m, int n) {
        Integer[][] memo=new Integer [m+1][n+1];
        return grid(m,n,memo);
        
    }
    public int grid(int m,int n,Integer[][] memo){
        if(memo[m][n]!=null) return memo[m][n];
        if(m==1 && n==1) return 1;
        if(n<1 || m<1)return 0;
        memo[m][n]=grid(m-1,n,memo)+grid(m,n-1,memo);
        return memo[m][n];
    }
    
   
    
}