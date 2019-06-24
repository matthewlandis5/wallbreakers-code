class Solution {
    public int[] plusOne(int[] digits) {
        boolean ex=true;
        for(int temp:digits){
            if(temp!=9)ex=false;
        }
        int[] r;
        if(ex){
            r=new int[digits.length+1];
            r[0]=1;
            for(int i=1;i<r.length;i++)r[i]=0;
        }else{
            int l=digits.length;
            r=digits;
            boolean y=true;
            boolean a=false;
            while(y){
                l--;
                if(digits[l]!=9){
                    y=false;
                    r[l]++;
                }else{
                    r[l]=0;
                }
            }
        }
        return r;
    }
}