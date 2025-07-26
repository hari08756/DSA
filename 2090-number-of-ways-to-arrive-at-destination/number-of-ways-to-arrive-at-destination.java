import java.util.*;

class Solution {
    private static final int MOD = 1_000_000_007;

    public int countPaths(int n, int[][] roads) {
        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] road : roads) {
            int u = road[0];
            int v = road[1];
            int time = road[2];
            graph[u].add(new int[]{v, time});
            graph[v].add(new int[]{u, time});
        }

        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[0] = 0;
        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        pq.offer(new long[]{0, 0});

        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            long d = cur[0];
            int u = (int) cur[1];
            if (d != dist[u]) continue;
            for (int[] edge : graph[u]) {
                int v = edge[0];
                long w = edge[1];
                long newDist = d + w;
                if (newDist < dist[v]) {
                    dist[v] = newDist;
                    pq.offer(new long[]{newDist, v});
                }
            }
        }

        long[] dp = new long[n];
        dp[0] = 1;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, Comparator.comparingLong(a -> dist[a]));

        for (int i = 0; i < n; i++) {
            int u = indices[i];
            if (dist[u] == Long.MAX_VALUE) continue;
            for (int[] edge : graph[u]) {
                int v = edge[0];
                long w = edge[1];
                if (dist[u] + w == dist[v]) {
                    dp[v] = (dp[v] + dp[u]) % MOD;
                }
            }
        }

        return (int) (dp[n-1] % MOD);
    }
}