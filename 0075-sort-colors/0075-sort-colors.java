class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0 , ones = 0 , twos = 0 ;
        for(int num : nums){
            if(num == 0) zeros+=1;
            else if (num == 1) ones+=1;
            else twos+=1;
        }
        int i ;
        for( i = 0 ; i < zeros ; i++) nums[i] = 0 ;
        for( i = zeros ; i < ones+zeros ; i++) nums[i] = 1 ;
        for( i = ones+zeros ; i < nums.length ; i++) nums[i] = 2 ;
    }
}