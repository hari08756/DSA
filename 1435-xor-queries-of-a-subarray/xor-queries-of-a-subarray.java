class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int q = queries.length;
        int [] pref = new int [n+1];
        pref [0] = 0;
        for(int i = 0; i<n; i++){
            pref[i+1] = pref[i] ^ arr[i];
        }
        int [] ans = new int[q];
        for(int k = 0; k<q; k++){
            int L = queries[k][0];
            int R = queries[k][1];
            ans[k] = pref[R+1] ^ pref[L];
        }
        return ans;
    }
}