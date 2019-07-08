class Solution {
    public boolean isSubsequence(String s, String t) {//could have used indexOf()
        int i=0,j=0;
        int lenS=s.length();
        int lenT=t.length();
        
        if(lenS==0)return true;
        while(j<lenT){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            if(i==lenS)return true;
            j++;
        }
        return false;
    }
}