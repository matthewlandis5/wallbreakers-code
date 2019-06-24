class Solution {
    public String reverseVowels(String s) {
        String r="";
        char t;
        ArrayList<Integer> loc=new ArrayList<Integer>();
        char[] rt=new char[s.length()];
        
        for(int i=0;i<s.length();i++){
            t=s.charAt(i);
            if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u')loc.add(i);
            if(t=='A'||t=='E'||t=='I'||t=='O'||t=='U')loc.add(i);
            rt[i]=t;
        }
        for(int i=0;i<loc.size()/2;i++){
            t=rt[loc.get(i)];
            rt[loc.get(i)]=rt[loc.get(loc.size()-i-1)];
            rt[loc.get(loc.size()-i-1)]=t;
        }
        for(char te:rt){
            r+=te;
        }
        return r;
        
    }
}