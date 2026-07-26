class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         int j = 0 ;
         HashMap<Integer , Integer> hm = new HashMap<>();
         while(j < nums.length){
            if(!hm.containsKey(nums[j])){
                hm.put(nums[j],j);
            }else{
                int index = hm.get(nums[j]);
                if(Math.abs(j-index) <= k) return true;
                hm.replace(nums[j],j);
            }
            j+=1;
         }
            return false ;
    }
}