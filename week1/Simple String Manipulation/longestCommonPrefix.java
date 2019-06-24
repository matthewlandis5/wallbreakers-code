class Solution {
    public String longestCommonPrefix(String[] strs) {
        int max=99999;
        int count=0;
        if(strs.length==0)return "";
        for(String st:strs){
            if(st.length()<max)max=st.length();
        }
        while(count<max){
            for(int i=0;i<strs.length-1;i++){
                if(strs[i].charAt(count)!=strs[i+1].charAt(count))return strs[0].substring(0,count);
            }
            count++;
        }
        if(count==0)return "";
        return strs[0].substring(0,count);
    }
}