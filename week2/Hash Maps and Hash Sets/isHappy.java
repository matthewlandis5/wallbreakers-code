class Solution {
    public boolean isHappy(int n) {
        Set<Integer> done = new HashSet<>(); 
        while(n!=1){
            n=set(n);
            if(done.contains(n))
                return false;
            done.add(n);
        }
        return true;
    }
    private int set(int n){
        int r=0;
        while(n>0){
            r+=(n%10)*(n%10);
            n/=10;
        }
        return r;
    }
}