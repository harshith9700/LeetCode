class Solution {
    public int alternatingSubarray(int[] nums) {
        int max = -1;

        for (int i = 0; i < nums.length; i++) {
            int len = 1;

            for (int j = i + 1; j < nums.length; j++) {

                int diff = nums[j] - nums[j - 1];
                int expected = (len % 2 == 1) ? 1 : -1;

                if (diff == expected) {
                    len++;
                    max = Math.max(max, len);
                } else {
                    break;
                }
            }
        }

        return max;
    }
}