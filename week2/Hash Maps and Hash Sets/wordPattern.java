class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap<>();
        String[] words = str.split(" ");
        
        if(pattern.length()!=words.length)return false;
        for(int i=0;i<pattern.length();i++){
            if(i>=words.length)
                return false;
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(words[i]))
                    return false;
            }else{
                if(!map.containsValue(words[i]))
                    map.put(pattern.charAt(i),words[i]);
                else
                    return false;
            }
        }
        return true;
    }
}