class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String> > h=new HashMap<>();
        for(String i:strs){
            char c[]=i.toCharArray();
            Arrays.sort(c);
            String t=new String(c);
            h.put(t,null);
        }
        
        for(String i:strs){
            char c[]=i.toCharArray();
            Arrays.sort(c);
            String t=new String(c);
            h.putIfAbsent(t,new ArrayList<>());
            h.get(t).add(i);
           
        }
        return new ArrayList(h.values());
    }
}