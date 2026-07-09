class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0 ;
        String dupS = s.strip();
        for(int i = dupS.length()-1 ; i >= 0 ; i--){
            char temp = dupS.charAt(i);
            if(temp == ' ')
                break;
            count+=1;
        }
        return count;
    }
}