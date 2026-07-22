class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int[] ans = new int[2];
        int start = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                start = mid;
                break;
            }
        }
        while (start > 0 && start != -1) {
            if (nums[start - 1] != nums[start])
                break;
            start--;
        }
        if (start == -1) {
            ans[0] = -1;
            ans[1] = -1;
        } else {
            ans[0] = start;
            while (start < nums.length - 1 && nums[start + 1] == target) {
                start++;
            }

            ans[1] = start;
        }
        return ans;
    }
}