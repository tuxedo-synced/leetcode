class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int l = 0 , r = 0 ;
        int maxLength = 0 ;
        while(r < s.length()){
            if(hm.containsKey(s.charAt(r))){
                l = Math.max(l , hm.get(s.charAt(r))+1);
            }
            hm.put(s.charAt(r),r);
            maxLength = Math.max(maxLength,r-l+1);
            r+=1;
        }
        return maxLength;
    }
}

/*
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 32 ; i <= 126 ; i++){
            char t = (char) i ;
            hm.put(t , 0);
        }
        int l = 0 , r = 0 ;
        int maxLength = 0 ;
        while(r < s.length()){
            int t = hm.get(s.charAt(r));
            if(t == 0){
                hm.replace(s.charAt(r),t+1);
                r+=1;
            }else{
                maxLength = Math.max(maxLength,r-l);
                while(s.charAt(l) != s.charAt(r)){
                    hm.put(s.charAt(l),0);
                    l+=1;
                }
                hm.put(s.charAt(l),0);
                l+=1;
            }
        }
        maxLength = Math.max(maxLength, r - l);
        return maxLength ;
    }
}
*/