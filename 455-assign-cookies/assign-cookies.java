import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length == 0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int maxChild = 0;
        for(int i = g.length -1; i>=0; i--){
            for(int j = s.length -1 ; j>=0; j--){
                if(g[i] <= s[j]){
                    s[j] = 0;
                    maxChild ++;
                    break;
                }
            }
        }
        return maxChild;
    }
}