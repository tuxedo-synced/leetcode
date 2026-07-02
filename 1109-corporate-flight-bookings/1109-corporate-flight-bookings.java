class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] p = new int[n] ;
        for(int i = 0 ; i < bookings.length ; i++){
            p[bookings[i][0]-1]+=bookings[i][2];
            if(bookings[i][1] < n) p[bookings[i][1]]-=bookings[i][2];
        }
        int t = 0;
        for(int i = 0 ; i < n ; i++){
            t += p[i];
            p[i] = t ;
        }
        return p ;
    }
}

