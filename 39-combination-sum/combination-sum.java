class Solution {
    public List<List<Integer>> combinationSum(int[] cand, int target) {
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        fun(0,target,l,cur,cand);
        return l;
    }
    void fun(int s,int t,List<List<Integer>> l,List<Integer> cur,int[] arr){
        if(t==0){
            l.add(new ArrayList<>(cur));
            return;
        }
        if(t<0){
            return;
        }
        for(int i=s;i<arr.length;i++){
            cur.add(arr[i]);
            fun(i,t-arr[i],l,cur,arr);
            cur.remove(cur.size()-1);
        }

    }
}