class Solution {
    public int maximumLengthSubstring(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String t = s.substring(i, j);

                if (fun(t)) {
                    ans = Math.max(ans, t.length());
                }
            }
        }

        return ans;
    }

    public boolean fun(String g) {
        int[] arr = new int[26];

        for (int i = 0; i < g.length(); i++) {
            arr[g.charAt(i) - 'a']++;

            if (arr[g.charAt(i) - 'a'] > 2) {
                return false;
            }
        }

        return true;
    }
}
