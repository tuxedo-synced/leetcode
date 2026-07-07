class Solution {
    public long sumAndMultiply(int n) {
        long digitSum = 0 , product = 1 , i = 0 , sum= 0;
        while(n != 0){
            int digit = n % 10 ;
            if(digit == 0){
                n/=10;
                continue;
            }
            else{
                sum= sum +(int)(digit*Math.pow(10,i));
                i+=1;
                digitSum+=digit;
                n/=10;
            }
        }
        return sum*digitSum;
    }
} 