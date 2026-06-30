class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0 ;
        int[] p = new int[nums.length+1] ;
        p[0] = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            sum+=nums[i];
            p[i+1] = sum ;
        } 
        for(int i = 1 ; i < p.length ; i++){
            if(p[i-1] == (p[p.length-1] - p[i])){
                return i-1;
            }
        }
        return -1;
    }
}