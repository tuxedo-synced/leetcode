class Solution {
    public boolean isPalindrome(String s) {
        int st = 0, ed = s.length() - 1;
        while (st < ed) {

            while (st < ed && !Character.isLetterOrDigit(s.charAt(st)))
                st++;

            while (st < ed && !Character.isLetterOrDigit(s.charAt(ed)))
                ed--;

            if (Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(ed)))
                return false;

            st++;
            ed--;
        }

        return true;
    }
}