class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0 , j = k-1 ;
        int sum = 0 ;
        int maxSum = Integer.MIN_VALUE ;
        if(j >= nums.length) return 0.0 ;
        for(int firstKSteps = 0 ; firstKSteps <= j ; firstKSteps++) sum+=nums[firstKSteps];
        maxSum = Math.max(maxSum , sum);
        while(j < nums.length-1){
            sum+=nums[++j];
            sum-=nums[i++];
            maxSum = Math.max(maxSum , sum);
        }
        return (double) maxSum/k;
    }
}