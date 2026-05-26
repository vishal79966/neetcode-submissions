class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int p1 = 0;
        int p2 = 1;
        while(p2<prices.length){
            if(prices[p1]<prices[p2]){
                int profit = prices[p2]-prices[p1];
                maxP = Math.max(maxP,profit);
            }else{
                p1 = p2;
            }
            p2++;
        }
        return maxP;
    }
}
