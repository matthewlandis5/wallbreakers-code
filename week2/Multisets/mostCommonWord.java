class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().split("[, ?.!';:\"]+");
        HashMap<String, Integer> map = new HashMap<>(); 
        for(String str:words){
            if(map.containsKey(str))map.put(str,map.get(str)+1);
            else map.put(str,1);
        }
        String maxStr="";
        int max=0;
        List<String> bad = Arrays.asList(banned);
        for(String str:words){
            if(!bad.contains(str)&&(map.get(str)>max)){
                max=map.get(str);
                maxStr=str;
            }
        }
        return maxStr;
    }
}
                                                       /*.replaceAll("[^a-zA-Z ]", "")*/