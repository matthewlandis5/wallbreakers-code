class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] r=new int[A.length][A[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                r[i][A[0].length-1-j]=A[i][j];
            }
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(r[i][j]==1)r[i][j]=0;
                else r[i][j]=1;
            }
        }
        return r;
    }
}