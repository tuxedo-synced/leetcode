class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0 , rsum = 0 ;
        int l = 0 , r = cardPoints.length-1 ;
        int maxPoints = 0 ;
        while(l < k){
            lsum+=cardPoints[l];
            l+=1;
        }
        maxPoints = Math.max(maxPoints , lsum);
        l-=1; // came one step forward than expected .
        while(l >= 0){
            lsum-=cardPoints[l];
            l-=1;
            rsum+=cardPoints[r];
            r-=1;
            maxPoints = Math.max(maxPoints , lsum+rsum);
        }
        return maxPoints ;
    }
}