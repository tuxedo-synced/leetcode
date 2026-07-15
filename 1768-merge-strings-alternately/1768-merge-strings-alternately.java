class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        int s1 = 0 , s2 = 0 ;
        int turn = 0 ;
        while(s1 < word1.length() && s2 < word2.length()){
            ans += (turn == 0)? word1.charAt(s1) : word2.charAt(s2) ;
            s1 = (turn == 0)? s1+1 : s1;
            s2 = (turn == 0)? s2 : s2+1 ;
            turn = (turn == 0)? 1 : 0 ;
        }
        while(s1 < word1.length()){
            ans+=word1.charAt(s1);
            s1+=1;
        }
        while(s2 < word2.length()){
            ans+=word2.charAt(s2);
            s2+=1;
        }
        return ans ;
    }
}