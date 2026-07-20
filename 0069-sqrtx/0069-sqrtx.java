class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        long x0 = x;
        while (x0 > x / x0) {
            x0 = (x0 + x / x0) / 2;
        }
        return (int) x0;
    }
}

/* Babylonian (Heron’s) Method -> x(n+1) = (x(n) + N / x(n)) / 2 , to calc (N)*0.5 */