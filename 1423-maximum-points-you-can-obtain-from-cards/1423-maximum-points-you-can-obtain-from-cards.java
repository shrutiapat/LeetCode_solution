class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0, sumOfCurrentWindow, window = cardPoints.length - k, total = 0;
        for(int i=0;i<window ;i++)
            sum+=cardPoints[i];
        sumOfCurrentWindow = -1*sum;
        total = sum;
        for(int i=1;i+window-1< cardPoints.length;i++) {
            sum = sum - cardPoints[i-1] + cardPoints[i+window-1];
            sumOfCurrentWindow = Math.max(sumOfCurrentWindow, -1 * sum);
            total += cardPoints[i+window-1];
        }
        return total + sumOfCurrentWindow;
    }
}