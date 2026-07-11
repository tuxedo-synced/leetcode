class Solution {
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        int lifeLine = 1;
        while (i < j) {
            while (i < j && s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }
            if (i == j)
                return true;
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
        }
        return true;
    }
}