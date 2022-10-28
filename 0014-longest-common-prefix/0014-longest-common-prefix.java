class Solution {
    public String longestCommonPrefix(String[] strs) {
        String temp="",ans="";
        if(strs.length==1) return strs[0];
        for(int i=0;i<strs.length-1;i++){
            int j=0;
            while(j<strs[i].length() && j<strs[i+1].length()){
                if(strs[i].charAt(j)==strs[i+1].charAt(j)) temp+=strs[i].charAt(j);
                else break;
                j++;
            }
            strs[i+1]=temp;
            ans=temp;
            temp="";
        }
        return ans;
    }
}