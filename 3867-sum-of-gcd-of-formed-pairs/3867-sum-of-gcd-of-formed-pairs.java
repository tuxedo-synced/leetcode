class Solution {
    public long gcd(int a , int b){
        if(b == 0) return a;
        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        int[] mx = new int[nums.length] ;
        mx[0] = nums[0] ;
        for(int i = 1 ; i < nums.length ; i++){
            mx[i] = Math.max(mx[i-1],nums[i]);
        }

        int[] prefixGod = new int[nums.length];
        for(int i = 0 ; i < prefixGod.length ; i++){
            prefixGod[i] = (int) gcd(nums[i] , mx[i]);
        }
        Arrays.sort(prefixGod);
        int i = 0 , j = prefixGod.length-1;
        long ans = 0;
        while(i < j){
            ans+=gcd(prefixGod[i],prefixGod[j]);
            i+=1;
            j-=1;
        }
        return ans ;
    }
}