class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0 , j = 0 ;
        int minLength = Integer.MAX_VALUE ;
        int sum = 0 ;
        while(j < nums.length){
            sum+=nums[j];
            if(sum > target){
                minLength = Math.min(minLength , j-i+1);
                sum-=nums[i++];
                sum-=nums[j];
            }else if(sum < target){
                j++;
            }else{
                minLength = Math.min(minLength , j-i+1);
                j+=1;
            }
        }
        return (minLength == Integer.MAX_VALUE)? 0 : minLength ;
    }
}