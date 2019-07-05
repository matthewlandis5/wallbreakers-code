class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character, ArrayList<Integer>> mapS = new HashMap<>();
        HashMap<Character, ArrayList<Integer>> mapT = new HashMap<>();
        char c=' ';
        ArrayList<Integer> tempList;
        
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(!mapS.containsKey(c)){
                mapS.put(c,new ArrayList<Integer>(Arrays.asList(i)));
            }else{
                tempList=mapS.get(c);
                tempList.add(i);
                mapS.put(c,(ArrayList)tempList);
            }
            c=t.charAt(i);
            if(!mapT.containsKey(c)){
                mapT.put(c,new ArrayList<Integer>(Arrays.asList(i)));
            }else{
                tempList=mapT.get(c);
                tempList.add(i);
                mapT.put(c,(ArrayList)tempList);
            }
            if(!mapS.get(s.charAt(i)).equals(mapT.get(t.charAt(i))))return false;
        }
        return true;
    }
}