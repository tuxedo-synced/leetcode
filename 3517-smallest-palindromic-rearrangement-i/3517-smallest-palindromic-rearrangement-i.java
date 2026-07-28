class Solution {
    public String smallestPalindrome(String s) {
        int[] counter = new int[26];

        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
        }

        StringBuilder ansFirst = new StringBuilder();
        StringBuilder ansMiddle = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char ch = (char) (i + 'a');

            for (int j = 0; j < counter[i] / 2; j++) {
                ansFirst.append(ch);
            }

            if (counter[i] % 2 == 1) {
                ansMiddle.append(ch);
            }
        }

        String ansSecond = new StringBuilder(ansFirst).reverse().toString();

        return ansFirst.toString() + ansMiddle.toString() + ansSecond;
    }
}