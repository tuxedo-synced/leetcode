class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int t = 0 ;
        String ans = "" ;
        for(int i = shifts.length-1 ; i >= 0 ; i--){
            t+=(shifts[i]%26);
            shifts[i]=t;
        }
        for(int i = 0 ; i < s.length() ; i++){
            int calc = ((s.charAt(i) - 'a' + shifts[i]) % 26) + 'a' ;
            char subAns = (char) calc ;
            ans+=subAns;
        }
        return ans ;
    }
}