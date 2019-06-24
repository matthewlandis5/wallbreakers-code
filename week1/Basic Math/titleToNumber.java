class Solution {
    public int titleToNumber(String s) {
        int r=0;
        char temp;
        for(int i=0;i<s.length();i++){
            temp=s.charAt(i);
            r+=(temp-'A'+1)*Math.pow(26,s.length()-i-1);
        }
        return r;
    }
}