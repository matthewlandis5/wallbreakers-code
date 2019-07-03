class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.'||!set.contains(board[i][j]))set.add(board[i][j]);
                else return false;
            }
            set.clear();
        }
        for(int i=0;i<board[0].length;i++){
            for(int j=0;j<board.length;j++){
                if(board[j][i]=='.'||!set.contains(board[j][i]))set.add(board[j][i]);
                else return false;
            }
            set.clear();
        }
        for(int i=0;i<3;i++) {
        	for(int j=0;j<3;j++) {
        		for(int k=0;k<3;k++) {
        			for(int l=0;l<3;l++) {
        				if(board[k+i*3][l+j*3]=='.'||!set.contains(board[k+i*3][l+j*3]))
                            set.add(board[k+i*3][l+j*3]);
                        else return false;
        			}
        		}
        		set.clear();
        	}
        }
        return true;
    }
}