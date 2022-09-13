class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[r].length;c++){
                if(grid[r][c]=='1'){
                    count+=1;
                    bfs(grid,r,c);
                }
            }
        }
        return count;
        
    }
    
    public void bfs(char[][] grid,int r,int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[r].length || grid[r][c]=='0')
            return;
        grid[r][c]='0';
        bfs(grid,r+1,c);
        bfs(grid,r-1,c);
        bfs(grid,r,c+1);
        bfs(grid,r,c-1);
    }
}