class Solution {
    public int maxDepth(String s) {
        int d = 0;
        int m = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                d++;
                m = Math.max(m, d);
            } 
            else if (ch == ')') {
                d--;
            }
        }

        return m;
    }
}