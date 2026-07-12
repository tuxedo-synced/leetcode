class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0, j, k, l;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subAns;
        while (i < nums.length-3) {
            j = i + 1;
            while (j < nums.length-2) {
                k = j + 1;
                l = nums.length - 1;
                while (k < l) {
                    long sum = 0L + nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum > target)
                        l -= 1;
                    else if (sum < target)
                        k += 1;
                    else {
                        subAns = new ArrayList<>();
                        subAns.add(nums[i]);
                        subAns.add(nums[j]);
                        subAns.add(nums[k]);
                        subAns.add(nums[l]);
                        ans.add(subAns);
                        do {
                            k++;
                        } while (k < l && nums[k] == nums[k - 1]);
                        do {
                            l--;
                        } while (k < l && nums[l] == nums[l + 1]);
                    }
                }
                do {
                    j++;
                } while (j < nums.length && nums[j] == nums[j - 1]);
            }
            do {
                i++;
            } while (i < nums.length && nums[i] == nums[i - 1]);
        }
        return ans;
    }
}