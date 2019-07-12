class Solution {
    public int[][] merge(int[][] intervals) {
        int[][] result=new int[intervals.length][2];
        double[] combine=new double[intervals.length*2];
        int index=0;
        for(int i=0;i<intervals.length;i++){
            combine[index++] = intervals[i][0];
            combine[index++] = intervals[i][1] + 0.5;
        }
        Arrays.sort(combine);
        
        int count=0;
        int len=0;
        for(double i:combine){
            if(i%1==0){
                if(count++==0) {
                    result[len][0]=(int)i;
                }
            }else{
                if(count--==1){
                    result[len++][1]=(int)i;
                }
            }
        }
        return Arrays.copyOf(result,len);        
    }
}