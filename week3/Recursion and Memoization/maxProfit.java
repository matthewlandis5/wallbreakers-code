class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2)
            return 0;

        int min=prices[0];
        int maxPro=0;
        int temp;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min)
                min=prices[i];
            temp=prices[i]-min;
            if(maxPro<temp)
                maxPro=temp;
        }
        return maxPro;
    }
}