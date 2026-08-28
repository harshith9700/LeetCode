class Solution {
    public int minimumDistance(int[] nums) {

        int max = 0;

        // Find maximum value
        for (int i : nums) {
            if (max < i) {
                max = i;
            }
        }

        // Count frequency
        int hash[] = new int[max + 1];

        for (int i : nums) {
            hash[i]++;
        }

        int ans = Integer.MAX_VALUE;

        // Check every number
        for (int value = 0; value <= max; value++) {

            // We need at least 3 occurrences
            if (hash[value] >= 3) {

                List<Integer> l = new ArrayList<>();

                // Store indices
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == value) {
                        l.add(i);
                    }
                }

                // Check every group of 3
                for (int i = 0; i < l.size() - 2; i++) {

                    int a = l.get(i);
                    int b = l.get(i + 1);
                    int c = l.get(i + 2);

                    int distance =
                        Math.abs(a - b)
                        + Math.abs(b - c)
                        + Math.abs(c - a);

                    ans = Math.min(ans, distance);
                }
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}