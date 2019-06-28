class Solution {
    public boolean isAnagram(String s, String t) {
        char temp;
        int loc;
        int len=s.length();
        if(len!=t.length())return false;
        for(int i=0;i<len;i++){
            temp=s.charAt(0);
            loc=t.indexOf(temp);
            if(loc==-1)return false;
            else{
                s=s.substring(1);
                t=t.substring(0,loc)+t.substring(loc+1);
            }
        }
        return true;
    }
}