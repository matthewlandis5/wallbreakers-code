class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> loc=new ArrayList<>();
        if(p.length()>s.length())return loc;
        for(int i=0;i<s.length()-p.length()+1;i++){
            if(hash(s.substring(i,i+p.length()),p)){
                loc.add(i);
            }
        }
        return loc;
    }
    private static boolean hash(String s, String p){
        HashSet<String> set = new HashSet<>();
        char[][] found = new char[2][26];
        for(int i=0;i<26;i++) {
        	found[0][i]='a';
        	found[1][i]='a';
        }
        for(int i=0;i<s.length();i++) {
            found[0][s.charAt(i)-'a']++;
            found[1][p.charAt(i)-'a']++;
        }
        set.add(new String(found[0]));
        return set.contains(new String(found[1]));
    }  
}