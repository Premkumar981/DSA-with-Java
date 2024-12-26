class Solution {
    public int maxProfit(int[] prices) {
        int[] maxVal = new int[prices.length];

        maxVal[prices.length-1] = prices[prices.length-1];

        for(int i=prices.length-2;i>=0;i--){
            maxVal[i] = Math.max(maxVal[i+1],prices[i]);
        }

        int ans = 0;

        for(int i=0;i<prices.length;i++){
            int currPro = maxVal[i] - prices[i];

            ans = Math.max(currPro, ans);
        }
        return ans;
    }
}
//premkumarsuru
