class Solution {
    public long getNumber(String s, char signCheck){
        long sum = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if((s.charAt(i) == '-' || s.charAt(i) == '+') && i == 0) continue ;
            else if(Character.isDigit(s.charAt(i))){
            int val = s.charAt(i) -'0';
            sum = sum * 10 + val;
             if(sum > Integer.MAX_VALUE){
                 return signCheck == '-'? Integer.MIN_VALUE : Integer.MAX_VALUE ;
            }
        }
        else break;
        }
            return sum ;
    }

    public int myAtoi(String s) {
        s = s.trim();
        if(s.isEmpty()) return 0;
        char signCheck = s.charAt(0);
        long ans = getNumber(s,signCheck);
        if(signCheck == '-') ans*=-1;
        return (int) ans ;
    }
}