class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List <Integer>revmat= new ArrayList<Integer>();
        int re=matrix.length-1;
        int ce=matrix[0].length-1;
        int cb=0;
        int rb=0;
        while(rb<=re && cb<=ce){
            for(int i=cb;i<=ce;i++){
                revmat.add(matrix[rb][i]);
            }
            rb++;
            for(int i=rb;i<=re;i++){
                revmat.add(matrix[i][ce]);
            }
            ce--;
            if(rb<=re){
                for(int i=ce;i>=cb;i--){
                    revmat.add(matrix[re][i]);
                }
            }
            re--;
            if(cb<=ce){
                for(int i=re;i>=rb;i--){
                    revmat.add(matrix[i][cb]);
                }
            }
            cb++;
        }
        return revmat;
    }
        
        
}