class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
       int i=0,j=0;
       int ans = -1;
       int n1=nums1.length,n2=nums2.length;
       while(n1>i && n2>j){
        if(nums1[i]==nums2[j]){
            ans=nums1[i];
            break;

        }
        else if(nums1[i]<nums2[j]){
            i++;
        }
        else{
            j++;
        }
       }
       return ans;
    }
}