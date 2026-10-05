class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int j=0;j<s.length();j++){
            char i=s.charAt(j);
            sum +=(26+(97-(int)i)) * (j+1); 
                   
        }
        return sum;
    }
}