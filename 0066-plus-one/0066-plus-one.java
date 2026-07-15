class Solution {

    public boolean AllNine(int[] digits) {
        for (int i : digits) {
            if (i != 9)
                return false;
        }
        return true;
    }

    public int[] plusOne(int[] digits) {

        if (AllNine(digits)) {
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            return ans;
        }

        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1]++;
            return digits;
        }

        int move = digits.length - 1;

        while (move >= 0) {
            if (digits[move] == 9) {
                digits[move] = 0;
                move--;
            } else {
                digits[move]++;
                return digits;
            }
        }

        return digits;
    }
}