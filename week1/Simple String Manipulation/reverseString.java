class Solution {
    public void reverseString(char[] s) {
        char temp;
        int l=s.length;
        for(int i=0;i<l/2;i++){
            temp=s[i];
            s[i]=s[l-i-1];
            s[l-1-i]=temp;
        }
    }
}