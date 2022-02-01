class Solution {
    public int maxProfit(int[] prices) {
      int minsofar=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            int curr=prices[i];
        
        minsofar=Math.min(minsofar,prices[i]);
        maxprofit=Math.max(maxprofit,prices[i]-minsofar);
        }
        return maxprofit;
    }
}