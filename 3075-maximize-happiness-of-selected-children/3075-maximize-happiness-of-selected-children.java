public class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);

        long total = 0;
        for (int turn = happiness.length; happiness.length - turn < k; --turn) {
            long current = Math.max(happiness[turn - 1] - (happiness.length - turn), 0);
            total += current;
        }
        return total;
    }
}