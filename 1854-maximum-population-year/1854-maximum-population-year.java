class Solution {
    public int maximumPopulation(int[][] logs) {
        int low = 1950 ;
        int high = 2050 ;
        int[] ps = new int[high-low+1];
        for(int[] log:logs){
            ps[log[0]-low]+=1;
            if((log[1]-low) < ps.length) ps[log[1]-low]-=1;
        }
        for(int i = 1 ; i < ps.length ; i++) ps[i] += ps[i-1] ;
        int maxElementIndex = 0 ;
        for(int i = 0 ; i < ps.length ; i++){
            if(ps[i] > ps[maxElementIndex]) maxElementIndex = i;
        }
        return maxElementIndex+low ;
    }
}