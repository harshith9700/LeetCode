class Solution {
    public boolean isPalindrome(ListNode head) {

        StringBuilder s = new StringBuilder();

        ListNode temp = head;

        while (temp != null) {
            s.append(temp.val);
            temp = temp.next;
        }

        String original = s.toString();

        s.reverse();

        return original.equals(s.toString());
    }
}