class Solution {
    public int binaryGap(int N) {
        int b=-1;
        int e=-1;
        int count=0;
        int max=0;
        
        while(N!=0){
            if((N&1)!=0){
            	if(b==-1)b=count;
            	e=count;
            	if(e-b>max)max=e-b;
                b=count;
            }
            count++;
            N>>=1;
            //System.out.println("Ran loop");
        }
        return max;
    }
}