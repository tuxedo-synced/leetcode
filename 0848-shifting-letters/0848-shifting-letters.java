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

/*
class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        
        char[] arr = s.toCharArray();

        long total = 0;

        for (int i = shifts.length - 1; i >= 0; i--) {

            total = (total + shifts[i]) % 26;

            arr[i] = (char)((arr[i] - 'a' + total) % 26 + 'a');
        }

        return new String(arr);
    }
}
*/
