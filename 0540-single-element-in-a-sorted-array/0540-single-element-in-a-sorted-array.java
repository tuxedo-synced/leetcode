class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i = 0 ;
        while(i < nums.length-1){
            if(nums[i] != nums[i+1]) return nums[i];
            i+=2;
        }
        return nums[nums.length-1];
    }
}

/*
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans = 0;
        for(int i : nums){
            ans^=i;
        }
        return ans ;
    }
}
*/
