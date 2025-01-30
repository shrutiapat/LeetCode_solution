class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int mini = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            mini = Math.min(mini, prices[i]);
            max = Math.max(max, prices[i]-mini);
        }
        return max;
        
    }
}