class Solution {
    public int romanToInt(String s) {
        HashMap<Character , Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int ans = 0 ;
        int i = 0 ;
        while(i < s.length()){
            int present = hm.get(s.charAt(i));
            int future = 0;
            if(i+1 < s.length()) future = hm.get(s.charAt(i+1));
            if( present < future){
                ans+=(future - present);
                i+=2;
            }else{
                ans+=present;
                i+=1;
            }
        }
        return ans ;
    }
}