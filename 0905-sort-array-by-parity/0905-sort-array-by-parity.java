class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0 , j = nums.length - 1;
        while(i <= j){
            while(i <= j && nums[i] % 2 == 0) i+=1;
            while(i <= j && nums[j] % 2 != 0) j-=1;
            if(i <= j){
                int temp = nums[i];
                nums[i] = nums[j] ;
                nums[j] = temp ;
            }
        }
        return nums ;
    }
}