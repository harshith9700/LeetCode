class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        for(int i:students){
            q.add(i);
        }
        int index = 0;
        int count = 0;
        while(!q.isEmpty()){
            int st=q.poll();
            if(st == sandwiches[index]){
            index++;
            count = 0;
            }
            else{
                q.add(st);
                count++;
            }
            if(count ==q.size()){
                break;
            }
        }
        return q.size();


    }
}