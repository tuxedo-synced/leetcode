class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subAns;
        Arrays.sort(nums);
        int i = 0 ,j ,k ;
        while(i < nums.length){
            j = i + 1 ;
            k = nums.length-1 ;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0) j+=1;
                else if(sum > 0) k-=1;
                else{
                    subAns = new ArrayList<>();
                    subAns.add(nums[i]);
                    subAns.add(nums[j]);
                    subAns.add(nums[k]);
                    ans.add(subAns);
                    do { j++; } while (j < k && nums[j-1] == nums[j]);
                    do { k--; } while (j < k && nums[k+1] == nums[k]);
                }
            }
            do { i++; } while (i < nums.length - 1 && nums[i] == nums[i - 1]);
        }
        return ans ;
    }
}