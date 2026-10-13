class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        int a[]=new int[2];
        int p=0;
        while(i<j){
            int sum =nums[i]+nums[j];
            if(sum==target){
                a[0]=i+1;
                a[1]=j+1;
                return a;
            }
            else if(target<sum){
                j--;
            }
            else{
                i++;
            }
        }
        return a;
    }
}