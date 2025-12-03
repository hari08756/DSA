import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length == 0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int n = g.length , m = s.length;
        int l = 0, r = 0;
        while(l<m && r<n){
            if(g[r] <= s[l]){
                r++;
            }
            l++;
        }
        
        return r;
    }
}