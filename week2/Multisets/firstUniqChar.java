class Solution {
    public int firstUniqChar(String s) {
        HashSet<Character> firstSet = new HashSet<>();
        HashSet<Character> secSet = new HashSet<>();
        int index=0;
        for(char t:s.toCharArray()){
            if(!firstSet.add(t))secSet.add(t);
        }
        for(char t:s.toCharArray()){
            if(!secSet.contains(t))return index;
            index++;
        }
        return -1;
    }
}