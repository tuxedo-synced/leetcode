class Solution {
    public boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch =='E' || ch == 'I' || ch == 'O' || ch == 'U' ;
    }
    public String reverseVowels(String s) {
        int st = 0 , ed = s.length() - 1 ;
        char[] temporary = s.toCharArray();
        while(st < ed){
            while(st < ed && !isVowel(temporary[st])){
                st+=1;
            }
            while(st < ed && !isVowel(temporary[ed])){
                ed-=1;
            }
            char temp = temporary[st];
            temporary[st] = temporary[ed];
            temporary[ed] = temp ;
            st++;
            ed--;
        }
        return new String(temporary) ;
    }
}