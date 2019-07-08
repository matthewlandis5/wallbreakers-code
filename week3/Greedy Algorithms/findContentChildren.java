class Solution {
    public int findContentChildren(int[] g, int[] s) {//g is child, s is cookie
        int happy=0,i=0,j=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<g.length&&j<s.length){
            if(s[j]>=g[i]){
                happy++;
                i++;
            }
            j++;
        }
        return happy;
    }
}