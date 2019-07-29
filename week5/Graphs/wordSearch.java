class Solution {	
	private int iLen,jLen,sLen;
    private String search;
    public static boolean exist(char[][] board, String word) {
        iLen=board.length;
        jLen=board[0].length;
        search=word;
        sLen=search.length();
        char first=word.charAt(0);
        for(int i=0;i<iLen; i++){
            for(int j=0;j<jLen;j++){
                if(board[i][j]==first) {
                    if(recur(board,0,i,j))return true;
                }
            }
        }
        return false;
    }
    private boolean recur(char[][] board,int count,int i,int j){
        if(count==sLen)return true;
        if(i>-1&&i<iLen&&j<jLen&&j>-1&&board[i][j]!='0'){
        	char[][] arrNew=arrHelp(board);
            if(search.charAt(count)==board[i][j]){
                count++;
                arrNew[i][j]='0';
                if(recur(arrNew,count,i+1,j))return true;
                if(recur(arrNew,count,i-1,j))return true;
                if(recur(arrNew,count,i,j+1))return true;
                if(recur(arrNew,count,i,j-1))return true;
                return false;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    private static char[][] arrHelp(char[][] arr) {
    	char[][] ret=new char[arr.length][arr[0].length];
    	for(int i=0;i<arr.length;i++) {
    		for(int j=0;j<arr.length;j++) {
    			ret[i][j]=arr[i][j];
    		}
    	}
    	return ret;
    }
}