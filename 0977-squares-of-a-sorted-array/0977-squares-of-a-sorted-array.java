class Solution {
    public int[] sortedSquares(int[] nums) {
        int cn = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0)
                cn++;
        }

        int cp = nums.length - cn;

        int[] n = new int[cn];
        int[] p = new int[cp];
        int[] ans = new int[nums.length];

        // Fill the arrays
        int ni = 0, pi = 0;
        for (int x : nums) {
            if (x < 0)
                n[ni++] = x * x;
            else
                p[pi++] = x * x;
        }

        // Merge
        int s1 = cn - 1;   // start from end of negative squares
        int s2 = 0;
        int idx = 0;

        while (s1 >= 0 && s2 < cp) {
            if (n[s1] <= p[s2]) {
                ans[idx++] = n[s1--];
            } else {
                ans[idx++] = p[s2++];
            }
        }

        while (s1 >= 0) {
            ans[idx++] = n[s1--];
        }

        while (s2 < cp) {
            ans[idx++] = p[s2++];
        }

        return ans;
    }
}