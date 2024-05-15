class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();
        int[][] dp = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        int[] row = {1, -1, 0, 0};
        int[] col = {0, 0, -1, 1};

        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                if (grid.get(i).get(j) == 1) {
                    q.offer(new int[]{0, i, j});
                    visited[i][j] = true;
                    dp[i][j] = 0;
                }
            }
        }

        while (!q.isEmpty()) {
            int stp = q.peek()[0];
            int a = q.peek()[1];
            int b = q.peek()[2];
            q.poll();
            for (int i = 0; i < 4; i++) {
                int r = a + row[i];
                int c = b + col[i];
                if (r >= 0 && r < n && c >= 0 && c < n && !visited[r][c]) {
                    q.offer(new int[]{stp + 1, r, c});
                    visited[r][c] = true;
                    dp[r][c] = stp + 1;
                }
            }
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> y[0] - x[0]);
        visited = new boolean[n][n];
        pq.offer(new int[]{dp[0][0], 0, 0});

        while (!pq.isEmpty()) {
            int wt = pq.peek()[0];
            int a = pq.peek()[1];
            int b = pq.peek()[2];
            pq.poll();
            if (visited[a][b]) continue;
            visited[a][b] = true;
            if (a == n - 1 && b == n - 1) return wt;
            for (int i = 0; i < 4; i++) {
                int r = a + row[i];
                int c = b + col[i];
                if (r >= 0 && r < n && c >= 0 && c < n && !visited[r][c]) {
                    pq.offer(new int[]{Math.min(dp[r][c], wt), r, c});
                }
            }
        }

        return 0;
    }
}