class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        fun(0,nums.length,nums,l);
        return l;
    }
    void fun(int s,int n,int[] nums,List<List<Integer>> l){
        if(s==n){
            List<Integer> c=new ArrayList<>();
            for(int i:nums){
                c.add(i);
            }
            l.add(new ArrayList<>(c));
            return;
        }
        for(int i=s;i<n;i++){
            swap(s,i,nums);
            fun(s+1,n,nums,l);
            swap(s,i,nums);
        }

    }
    void swap(int a,int b,int[] nums){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}