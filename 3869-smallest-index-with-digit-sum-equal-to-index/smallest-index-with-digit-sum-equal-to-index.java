class Solution {
    public int smallestIndex(int[] nums) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            int sum=0;
            while(x>0){
                int s=x%10;
                sum=sum+s;
                x=x/10;
            }
            if(sum==i){
                l.add(i);
            }
        }
        int ans=-1;
        Collections.sort(l);
        if(l.size()>0){
           ans=l.get(0);
        }
        return ans;
    }
}