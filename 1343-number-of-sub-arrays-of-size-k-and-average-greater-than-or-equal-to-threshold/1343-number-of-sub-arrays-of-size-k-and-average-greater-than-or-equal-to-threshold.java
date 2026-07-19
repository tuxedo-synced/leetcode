class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i = 0 , j = k-1 ;
        int maxSubArrayCount = 0 ;
        int sum = 0 ;
        for(int initialCheck = 0 ; initialCheck <= j ; initialCheck++){
            sum+=arr[initialCheck];
        }
        if(sum >= threshold*k) maxSubArrayCount++;
        while(j < arr.length-1){
            sum+=arr[++j];
            sum-=arr[i++];
            if(sum >= threshold*k) maxSubArrayCount++;
        }
        return maxSubArrayCount;
    }
}