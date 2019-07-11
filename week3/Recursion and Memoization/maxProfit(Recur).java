class Solution {
    private int min,maxPro,temp;
    public int maxProfit(int[] prices) {
        if(prices.length<2)
            return 0;
        min=prices[0];
        maxPro=0;
        return recur(Arrays.copyOfRange(prices,1,prices.length));
    }
    private int recur(int[] prices){
        if(prices.length==0)return maxPro;
        if(prices[0]<min)
            min=prices[0];
        temp=prices[0]-min;
        if(maxPro<temp)
            maxPro=temp;
        return recur(Arrays.copyOfRange(prices,1,prices.length));
    }
}