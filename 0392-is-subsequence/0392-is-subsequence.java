class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0 , j = 0 ;
        while(i < s.length() && j < t.length()){
            char val = s.charAt(i);
            while(j < t.length() && t.charAt(j) != val){
                j+=1;
            }
            if(j >= t.length()) return false;
            i+=1;
            j+=1;
        }
        if(i >= s.length()) return true ;
        else return false;
    }
}