class Solution {
    public boolean isBipartite(int[][] graph){
        int[] arr = new int[graph.length];
        for(int n=0;n<graph.length;n++){
            if(arr[n]==0&&!recur(n, 1, arr, graph))return false;
        }
        return true;
    }
    
    private boolean recur(int n,int pos,int[] arr,int[][] graph){
        if(arr[n]!=0)
            return arr[n]==pos;
        arr[n]=pos;
        for(int i:graph[n]) {
            if(!recur(i,3-pos,arr,graph)) 
                return false;
        }
        return true;
    }
}