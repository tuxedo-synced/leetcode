class Solution {
    public boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }

    public int maxVowels(String s, int k) {
        int i = 0 , j = k-1 ;
        int maxCount = 0 ;
        int count = 0 ;
        for(int initialCheck = 0 ; initialCheck <= j ; initialCheck++) if(isVowel(s.charAt(initialCheck))) count+=1;
        maxCount = Math.max(maxCount , count);
        while(j < s.length()-1){
            if(isVowel(s.charAt(j+1))) count+=1;
            if(isVowel(s.charAt(i))) count-=1;
            i++;
            j++;
            maxCount = Math.max(maxCount , count);
        }
        return maxCount;
    }
}