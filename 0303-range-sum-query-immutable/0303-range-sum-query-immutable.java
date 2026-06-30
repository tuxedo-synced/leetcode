class NumArray {
    int[] p ;
    public NumArray(int[] nums) {
        int sum = 0 ;
        p = new int[nums.length] ;
        for(int i = 0 ; i < nums.length ; i++){
            sum+=nums[i];
            p[i] = sum ;
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0) return p[right] ;
        else return p[right] - p[left-1] ;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */