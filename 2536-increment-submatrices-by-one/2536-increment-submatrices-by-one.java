class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] ans = new int[n][n];
        for (int[] query : queries) {
            int row1 = query[0], col1 = query[1];
            int row2 = query[2], col2 = query[3];
            ans[row1][col1]++;

            if (row2 + 1 < n)
                ans[row2 + 1][col1]--;

            if (col2 + 1 < n)
                ans[row1][col2 + 1]--;

            if (row2 + 1 < n && col2 + 1 < n)
                ans[row2 + 1][col2 + 1]++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0)
                    ans[i][j] += ans[i - 1][j];
                if (j > 0)
                    ans[i][j] += ans[i][j - 1];
                if (i > 0 && j > 0)
                    ans[i][j] -= ans[i - 1][j - 1];
            }
        }
        return ans;
    }
}