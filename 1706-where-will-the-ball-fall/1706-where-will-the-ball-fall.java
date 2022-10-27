class Solution {
    public int[] findBall(int[][] grid) {
        int[] ans=new int[grid[0].length];
        for(int i=0;i<grid[0].length;i++){
            ans[i]=Grid(grid,0,i);
            
        }
        return ans;
    }
    public int Grid(int[][] mat,int r,int c){
       
        
        if(r==mat.length) return c;
        if(c+mat[r][c]<0 || c+mat[r][c]>=mat[0].length) return -1; 
        if(mat[r][c]==mat[r][c+mat[r][c]]) 
            return Grid(mat,r+1,c+mat[r][c]);
        
        return -1;
    }         
        
    
}