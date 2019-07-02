class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        String AB=A+" "+B;
        String[] words = AB.split(" ");
        Set<String> in = new HashSet<>(); 
        Set<String> out = new HashSet<>();
        String[] r;
        
        for(int i=0;i<words.length;i++){
            if(!out.contains(words[i])&&!in.contains(words[i]))in.add(words[i]);
            else {
                out.add(words[i]);
                in.remove(words[i]);
            }
        }
        r=new String[in.size()];
        int count=0;
        for(String t:in){
           r[count]=t;
            count++;
        }
        return r;
    }
}