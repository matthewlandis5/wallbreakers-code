class Solution {
    public boolean isPowerOfTwo(int n) {
        int i=0;
        double r=0;
        while (r<=n){
            r=Math.pow(2,i);
            if(r==n)return true;
            i++;
        }
        return false;
    }
}