class Solution {
    public boolean judgeSquareSum(int c) {
        int left = 0 ;
        int right = (int) Math.sqrt(c) ;
        while(left <= right){
            long sum = (long) left*left + right*right ;
            if(sum == c) return true;
            else if(sum < c) left++;
            else right--;
        }
        return false;
    }
}

/*
class Solution {
    public boolean judgeSquareSum(int c) {
        for (long i = 0; i * i <= c; i++) {
            long rem = c - i * i;
            long root = (long) Math.sqrt(rem);

            if (root * root == rem) {
                return true;
            }
        }
        return false;
    }
}
*/