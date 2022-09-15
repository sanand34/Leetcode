
class Solution {

    public int tribonacci(int n) {
        int [] fib =new int[n+1];
         switch(n){
            case 0:return 0;
                    
            case 1: return 1;
             
            case 2: return 1;
            
                
        }
        fib[0]=0;
        fib[1]=1;
        fib[2]=1;
       
        for(int i=3;i<=n;i++){
            fib[i]=fib[i-1]+fib[i-2]+fib[i-3];
        }
        return fib[n];
        
        
    }
   
}