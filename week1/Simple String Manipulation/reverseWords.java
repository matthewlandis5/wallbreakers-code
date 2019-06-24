class Solution {
    public String reverseWords(String s) {
        String r="";
        ArrayList<Integer> loc=new ArrayList<Integer>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')loc.add(i);
        }
        if(loc.size()!=0){
            r+=flip(s.substring(0,loc.get(0)))+" ";
            for(int i=0;i<loc.size()-1;i++){
                r+=flip(s.substring(loc.get(i),loc.get(i+1)));
            }
            r+=flip(s.substring(loc.get(loc.size()-1)));
            r=r.substring(0,r.length()-1);
        }else{
           r=flip(s); 
        }
        return r;
        
    }
    public String flip(String str){
        String r="";
        for(int i=0;i<str.length();i++){
            r=str.charAt(i)+r;
        }
        return r;
    }
}