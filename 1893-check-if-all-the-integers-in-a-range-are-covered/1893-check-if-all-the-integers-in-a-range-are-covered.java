class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] ps = new int[50];
        for(int[] range : ranges){
            ps[range[0]-1]+=1;
            if(range[1] < ps.length) ps[range[1]]-=1;
        }
        for(int i = 1 ; i < ps.length ; i++){
            ps[i] += ps[i-1] ;
        }
        for(int i = left-1 ; i <= right-1 ; i++)
            if(ps[i] == 0) return false;
        return true ; 
    }
}