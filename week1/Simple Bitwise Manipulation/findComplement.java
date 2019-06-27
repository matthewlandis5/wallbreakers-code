class Solution {
    public int findComplement(int num) {
        int r=0;
        int update=1;
        
        while(num!=0){
            if((num&1)==0)r|=update;
            update<<=1;
            num>>=1;
        }
        return r;
    }
}