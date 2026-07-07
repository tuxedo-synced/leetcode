class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        ArrayList<Integer> lis = new ArrayList<>();
        for(int [] row : matrix){
            for(int num : row){
                lis.add(num);
            }
        }
        int l = 0;
        int r = lis.size()-1;
        while(l <= r){
            int m = l+(r-l)/2;
            if(lis.get(m) == target){
                return true;
            } else if (lis.get(m) > target){
                r = m-1;
            } else {
                l = m+1;
            }
        }
        return false;
    }
}