class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0 ; i < nums.length ; i++){
            if(hm.containsKey(target-nums[i])){
                ans[0] = i ;
                ans[1] = hm.get(target-nums[i]);
                break;
            } else{
                hm.put(nums[i],i);
            }
        }
        return ans ;
    }
}

/*
the below approch is just used to return true or false but when we want to do the problem and return the index then we also need to ue hashmap to store original index before sorting which is again taking extra space .

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0 , j = nums.length - 1 ;
        int[] ans = new int[2];
        while(i <= j){
            if(nums[i] + nums[j] == target){
                return true ;
            }else if(nums[i] + nums[j] > target){
                j-=1;
            }else{
                i+=1;
            }
        }
        return ans;
    }
}
*/