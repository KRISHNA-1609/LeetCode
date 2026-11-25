class Solution {
    public int balancedStringSplit(String s) {
        int balanced = 0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                balanced++;
            }
            else{
                balanced--;
            }
            if(balanced == 0){
                ans++;
            }
        }
        return ans;
    }
}