import java.util.*;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        fun(0,0,n,l,"");
        return l;
    }
    void fun(int open,int close,int n,List<String> l,String cur){
        if(cur.length()==2*n){
            l.add(cur);
            return;
        }
        if(open<n){
            fun(open+1,close,n,l,cur+"(");
        }
        if(open>close){
            fun(open,close+1,n,l,cur+")");
        }
    }
}