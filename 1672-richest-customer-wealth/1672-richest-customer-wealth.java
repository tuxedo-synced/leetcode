class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest = -1 ;
        for(int[] account : accounts){
            int sum = 0 ;
            for(int i = 0 ; i < account.length ; i++) sum+=account[i];
            richest = Math.max(richest , sum);
        }
        return richest;
    }
}