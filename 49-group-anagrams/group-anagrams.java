class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h=new HashMap<>();
        for(String t:strs){
            char a[]=t.toCharArray();
            Arrays.sort(a);
            String s=new String(a);
            if(!h.containsKey(s)){
                h.put(s,new ArrayList<>());
            }
            h.get(s).add(t);
        }
        return new ArrayList<>(h.values());
    }
}