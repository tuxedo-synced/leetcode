class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[Math.abs(nums[i])-1] > 0) nums[Math.abs(nums[i])-1]*=-1 ;
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > 0) {
                ans.add(i+1);
            }
        }
        return ans ;
    }
}


/*
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i : nums){
            if(hm.containsKey(i)){
                int value = hm.get(i);
                hm.replace(i,value+1);
            }else{
                hm.put(i,1);
            }
        }
        for(int i = 1 ; i <= nums.length ; i++){
            if(!hm.containsKey(i)) ans.add(i);
        }
        return ans ;
    }
}
*/ 