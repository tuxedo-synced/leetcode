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

/*
import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, List<int[]>> map = new HashMap<>();
        Set<List<Integer>> set = new HashSet<>();

        // Store all pair sums
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = nums[i] + nums[j];
                map.computeIfAbsent(sum, k -> new ArrayList<>())
                   .add(new int[]{i, j});
            }
        }

        // Find complementary pairs
        for (Integer sum : map.keySet()) {
            int complement = target - sum;

            if (!map.containsKey(complement))
                continue;

            for (int[] p1 : map.get(sum)) {
                for (int[] p2 : map.get(complement)) {

                    int i = p1[0], j = p1[1];
                    int k = p2[0], l = p2[1];

                    // Ensure all indices are distinct
                    if (i != k && i != l && j != k && j != l) {
                        List<Integer> quad = Arrays.asList(
                            nums[i], nums[j], nums[k], nums[l]
                        );

                        Collections.sort(quad);
                        set.add(quad);
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
}
*/