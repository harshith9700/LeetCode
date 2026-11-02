
import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {

        String s[] = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        List<String> l = new ArrayList<>();

        

        backtrac(0, l, digits, "", s);

        return l;
    }

    void backtrac(int ind, List<String> l,
                  String d, String curr, String[] s) {

        if (ind == d.length()) {
            l.add(curr);
            return;
        }

        int t = d.charAt(ind) - '0';

        String let = s[t];

        for (int i = 0; i < let.length(); i++) {

            backtrac(ind + 1, l, d,
                     curr + let.charAt(i), s);
        }
    }
}
