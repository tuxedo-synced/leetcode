class Solution {
    public int maxArea(int[] height) {
        int start = 0 ,end = height.length-1 ;
        int maxArea = 0 ;
        while(end >= 0 && start < height.length && start < end){
            int lengthStart = height[start];
            int lengthEnd = height[end];
            maxArea = Math.max(maxArea,(Math.min(lengthStart,lengthEnd)*(end-start)));
            System.out.println(maxArea);
            if(lengthStart <= lengthEnd) start+=1;
            else end-=1; 
        }
        return maxArea;
    }
}