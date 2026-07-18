class Solution {
    int gcd(int a , int b){
        if(b == 0) return a ;
        return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        int minVal = 10001;
        int maxVal = 1;
        for(int i : nums){
            if(i < minVal) minVal = i ;
            if(i > maxVal) maxVal = i ;
        }
        return gcd(minVal,maxVal);
    }
}