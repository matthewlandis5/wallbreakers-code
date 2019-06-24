class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0)return true;
        String str="";
        char t;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++) {
        	t=s.charAt(i);
        	if(((int)t>96&&(int)t<123)||((int)t>47&&(int)t<58))str+=t;
        }
        for(int i=0;i<str.length()/2;i++) {
        	if(str.charAt(i)!=str.charAt(str.length()-1-i))return false;
        }
        return true;
    }
}