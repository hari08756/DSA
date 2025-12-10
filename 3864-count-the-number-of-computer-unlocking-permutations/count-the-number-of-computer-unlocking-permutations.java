class Solution {
    public int countPermutations(int[] complexity) {
        int n = complexity.length;
        int minComp = complexity[0];
        for(int i = 1; i<n; i++){
            if(minComp >= complexity[i]){
                return 0;
            }
        }
        int MOD = 1000000007;
        long result = 1;
        for(int i = 1; i<n; i++){
            result = (result * i) % MOD;
        }
        return (int)result;
    }
}