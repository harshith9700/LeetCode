class Solution {
    public long sumAndMultiply(int n) {
        List<Integer> l=new ArrayList<>();
        long sum1=0;
        while(n>0){
            int s=n%10;
            sum1 +=s;
            l.add(s);
            n=n/10;
        }
        long sum=0;
        
        for(int i=l.size()-1;i>=0;i--){
            if(l.get(i)!=0){
                sum=sum*10;
                sum=sum+l.get(i);
                
            }
        }
        long ans=sum*sum1;
        return  ans;
    }
}