class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashSet<Integer> loc= new HashSet<>();
        boolean g;
        int sL=s.length();
        int pL=p.length();
        if(pL>sL){
            List<Integer> list = new ArrayList<Integer>(loc);
            return list;
        }
        char[] pA=p.toCharArray();
        Arrays.sort(pA);
        for(int i=0;i<sL-pL+1;i++){
            char[] sA=s.substring(i,i+pL).toCharArray();
            Arrays.sort(sA);
            g= Arrays.equals(sA,pA);
            if(g){
                loc.add(i);
            }
        }
        List<Integer> list = new ArrayList<Integer>(loc);
        return list;
    }
}