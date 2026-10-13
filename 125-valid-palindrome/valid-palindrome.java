class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder t=new StringBuilder();
        for(char i:s.toCharArray()){
            if(Character.isLetterOrDigit(i)){
               char h=Character.toLowerCase(i);
               t.append(h);
            }
        }
        String temp=t.toString();
        int i=0;
        int j=temp.length()-1;
        while(i<j){
            if(temp.charAt(i)==temp.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;

    }
}