class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] lsum = new int[nums.length] ;
        int[] rsum = new int[nums.length] ;
        int sum=0;
        for(int i = 1 ; i < lsum.length ; i++){
            sum+=nums[i-1];
            lsum[i] = sum ;
        }
        lsum[0] = 0 ;
        sum=0;
        for(int i = rsum.length - 2; i >= 0 ; i--){
            sum+=nums[i+1];
            rsum[i] = sum ;
        }
        rsum[nums.length-1] = 0 ;
        for(int i = 0 ; i < lsum.length ; i++){
            rsum[i] = Math.abs(lsum[i]-rsum[i]);
        }
    return rsum ;
    }
}