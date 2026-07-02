class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length() ;
        int q = shifts.length ;
        String ans = "" ;
        int[] temp = new int[n] ;
        for(int[] query : shifts){
            int start = query[0];
            int end = query[1] ;
            int step = query[2] ;
            if (step == 0){
                temp[start]-=1;
                if(end+1 < n) temp[end+1]+=1;
            }
            else {
                temp[start]+=1;
                if(end+1 < n) temp[end+1]-=1;
            }
        }
        
        for(int i=1;i<n;i++){
            temp[i]=temp[i]+temp[i-1];
        }
        
        for (int i= 0 ; i < n ; i++){
            int c = s.charAt(i)+temp[i]-'a';
            c = (c % 26 + 26) % 26;
            int t = c + 'a' ;
            char subans = (char) t ;
            ans+=subans;
        }
        return ans;
    }
}