class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer,Integer> mp = new TreeMap<>();
        int[] ans = new int[arr.length];
        for(int ele : arr) mp.put(Integer.valueOf(ele),0);
        int rankAppender = 1 ;
        for(Map.Entry<Integer,Integer> ele: mp.entrySet()){
            int key = ele.getKey();
            mp.replace(key,rankAppender);
            rankAppender+=1;
        }
        for(int i = 0 ; i < arr.length ; i++) ans[i] = mp.get(arr[i]);
        return ans;
    }
}