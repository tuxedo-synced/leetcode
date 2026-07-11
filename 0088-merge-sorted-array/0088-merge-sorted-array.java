class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m+n];
        int s1 = 0 , s2 = 0 ;
        int idx = 0 ;
        while(s1 < m && s2 < n){
            while(s1 < m && nums1[s1] < nums2[s2]){
                temp[idx] = nums1[s1];
                s1+=1;
                idx+=1;
            }
            while(s2 < n && nums1[s1] >= nums2[s2]){
                temp[idx] = nums2[s2];
                s2+=1;
                idx+=1;
            }
        }
        while(s1 < m){
            temp[idx] = nums1[s1];
            s1+=1;
            idx+=1;
        }
        while(s2 < n){
            temp[idx] = nums2[s2];
            s2+=1;
            idx+=1;
        }
        for(int i = 0 ; i < m+n ; i++){
            nums1[i] = temp[i];
        }
    }
}