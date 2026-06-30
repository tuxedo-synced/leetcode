class Solution {
    public void getPrefixPro(int[] nums , int[] p){
        int pro = 1 ;
        for(int i = 0 ; i < nums.length ; i++){
            pro*=nums[i];
            p[i] = pro ;
        }
    }
    public void getSuffixPro(int[] nums , int[] s){
        int pro = 1 ;
        for(int i = nums.length-1 ; i >= 0 ; i--){
            pro*=nums[i];
            s[i] = pro ;
        }
    }
    public int getLeftProduct(int[] p , int l , int r){
        if(l == 0) return p[r] ;
        else return p[r] / p[l-1] ;
    }
    public int getRightProduct(int[] s , int l , int r){
        if(r == s.length-1) return s[l];
        else return s[l]/s[r+1];
    }
    public int[] productExceptSelf(int[] nums) {
        int[] p = new int[nums.length] ;
        int[] s = new int[nums.length] ;
        int[] ans = new int[nums.length] ;
        getPrefixPro(nums,p);
        getSuffixPro(nums,s);
        for(int i = 0 ; i < nums.length ; i++){
            int pro = 1, left , right ;
            if(i > 0){
                left = getLeftProduct(p,0,i-1);
                pro*=left;
            }
            if(i < nums.length-1){
                right = getRightProduct(s,i+1,nums.length-1);
                pro*=right;
            }
            ans[i] = pro ;
        }
        return ans;
    }
}

/* 

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        prefix[0]=1;
        suffix[nums.length-1]=1;
        int pre = 1;
        int suf = 1;
        for (int i=1; i<nums.length;i++){
            pre*=nums[i-1];
            prefix[i]=pre;
        }
        for (int i=nums.length-2; i>=0;i--){
            suf*=nums[i+1];
            suffix[i]=suf;
        }
        int[] result = new int[nums.length];
        for (int i=0; i<nums.length;i++) {
            result[i]=prefix[i]*suffix[i];
        }
        return result;
        
    }
}

*/

