class Solution {
    public static int numSpecialEquivGroups(String[] A) {
        HashSet<String> set = new HashSet<>();
        String temp;
        for(String aString: A){
        	temp=hash(aString);
        	if(!set.contains(temp))set.add(temp);
        }
        return set.size();
    }
    private static String hash(String a){
        char[][] found = new char[2][26];
        for(int i=0;i<26;i++) {
        	found[0][i]='a';
        	found[1][i]='a';
        }
        int index =0;
        for(int i=0;i<a.length();i++) {
            found[index%2][a.charAt(i)-'a']++;
            index++;
        }
        return (new String(found[0]))+"&"+(new String(found[1]));
    }   
}