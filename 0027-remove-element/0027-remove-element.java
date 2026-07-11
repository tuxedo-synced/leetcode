class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0 , j = nums.length - 1;
        while(i <= j){
            while(i <= j && nums[i] != val) i+=1;
            while(i <= j && nums[j] == val) j-=1;
            if(i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp ;
            }
        }
        return j+1 ;
    }
}