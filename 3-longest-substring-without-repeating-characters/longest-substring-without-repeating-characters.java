class Solution {
    public int lengthOfLongestSubstring(String s) {
       int i=0;
       int j=0;
       int max=0;
       boolean b[]=new boolean[256];
       while(j<s.length()){
        if(!b[s.charAt(j)]){
            b[s.charAt(j)]=true;
            max=Math.max(max,j-i+1);
            j++;
        }
        else{
            b[s.charAt(i)]=false;
            i++;
        }
       }
       return max;
    }
}
