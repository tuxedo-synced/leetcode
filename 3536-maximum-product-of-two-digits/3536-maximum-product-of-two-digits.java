class Solution {
    public int maxProduct(int n) {
        int maxVal = 0 ;
        int secondMaxVal = -1 ;
        while(n != 0){
            int digit = n % 10 ;
            if(digit >= maxVal){
               secondMaxVal = maxVal ;
               maxVal = digit ;
            }else if(digit >= secondMaxVal){
                secondMaxVal = digit;
            }
            n/=10;
        }
        return maxVal*secondMaxVal;
    }
}