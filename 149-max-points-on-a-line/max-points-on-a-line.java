import java.util.*;

class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n < 3) {
            return n;
        }

        Map<String, Integer> pointCount = new HashMap<>();
        for (int[] p : points) {
            String key = p[0] + "," + p[1];
            pointCount.put(key, pointCount.getOrDefault(key, 0) + 1);
        }

        List<int[]> distinctPoints = new ArrayList<>();
        for (String key : pointCount.keySet()) {
            String[] parts = key.split(",");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);
            distinctPoints.add(new int[]{x, y});
        }
        int nDistinct = distinctPoints.size();
        if (nDistinct == 1) {
            return pointCount.values().iterator().next();
        }

        int[] countsArray = new int[nDistinct];
        for (int i = 0; i < nDistinct; i++) {
            int[] p = distinctPoints.get(i);
            countsArray[i] = pointCount.get(p[0] + "," + p[1]);
        }

        int maxCount = 0;
        for (int i = 0; i < nDistinct; i++) {
            int[] p1 = distinctPoints.get(i);
            int count1 = countsArray[i];
            Map<String, Integer> slopeCount = new HashMap<>();
            for (int j = 0; j < nDistinct; j++) {
                if (i == j) continue;
                int[] p2 = distinctPoints.get(j);
                int dx = p2[0] - p1[0];
                int dy = p2[1] - p1[1];

                String slopeKey;
                if (dx == 0 && dy == 0) {
                    continue;
                } else if (dx == 0) {
                    slopeKey = "0,1";
                } else if (dy == 0) {
                    slopeKey = "1,0";
                } else {
                    int g = gcd(dx, dy);
                    int dxReduced = dx / g;
                    int dyReduced = dy / g;
                    if (dxReduced < 0) {
                        dxReduced = -dxReduced;
                        dyReduced = -dyReduced;
                    }
                    slopeKey = dxReduced + "," + dyReduced;
                }
                slopeCount.put(slopeKey, slopeCount.getOrDefault(slopeKey, 0) + countsArray[j]);
            }
            int currentMax = 0;
            for (int count : slopeCount.values()) {
                if (count > currentMax) currentMax = count;
            }
            int total = count1 + currentMax;
            if (total > maxCount) {
                maxCount = total;
            }
        }
        return maxCount;
    }

    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}