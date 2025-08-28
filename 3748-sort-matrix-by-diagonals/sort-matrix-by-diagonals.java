import java.util.*;

class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                map.computeIfAbsent(key, k -> new ArrayList<>()).add(grid[i][j]);
            }
        }
        
        for (int key : map.keySet()) {
            if (key >= 0) {
                Collections.sort(map.get(key), Collections.reverseOrder());
            } else {
                Collections.sort(map.get(key));
            }
        }
        
        Map<Integer, Integer> indices = new HashMap<>();
        for (int key : map.keySet()) {
            indices.put(key, 0);
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                int idx = indices.get(key);
                grid[i][j] = map.get(key).get(idx);
                indices.put(key, idx + 1);
            }
        }
        
        return grid;
    }
}