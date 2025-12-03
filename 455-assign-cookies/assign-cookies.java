import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length == 0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int maxChild = 0;
        int j = s.length -1;
        for(int i = g.length -1; i>=0; i--){
            if(j>=0 && g[i] <= s[j]){
                maxChild ++;
                j--;
            }  
        }
        return maxChild;
    }
}