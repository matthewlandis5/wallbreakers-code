class Solution {
    private int[][] pos={{1,0},{-1, 0},{0, 1},{0,-1}};
    private int iLen,jLen;
    
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix==null||matrix.length==0)return 0;
        iLen=matrix.length; 
        jLen=matrix[0].length;
        int ret=0;
        Integer[][] arr=new Integer[iLen][jLen];
         for(int i=0;i<iLen;i++){
             for(int j=0;j<jLen;j++){
                if(arr[i][j]==null)
                   ret=Math.max(ret,recur(Integer.MIN_VALUE,i,j,matrix,arr));
             }
         }
        return ret;
    }
    
    private int recur(int last,int i,int j,int[][] matrix,Integer[][] arr){
        if(i<0||i>=iLen||j<0||j>=jLen)return 0;
        if(arr[i][j]!=null&&matrix[i][j]>last)return arr[i][j];
        if(matrix[i][j]<=last) return 0;
        int max=0;
        for(int[] p:pos){
            int iNew=i+p[0]; 
            int jNew=j+p[1];
            max=Math.max(max,recur(matrix[i][j],iNew,jNew,matrix,arr));
        }
        arr[i][j]=max+1;
        return arr[i][j];
        
    }
}