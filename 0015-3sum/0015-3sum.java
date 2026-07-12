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

/*

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            HashSet<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {

                int target = -nums[i] - nums[j];

                if (seen.contains(target)) {
                    ans.add(Arrays.asList(nums[i], target, nums[j]));

                    while (j + 1 < nums.length && nums[j] == nums[j + 1])
                        j++;
                }

                seen.add(nums[j]);
            }
        }

        return ans;
    }
}

*/