class Solution {
    public int maxScore(String s) {
        int maxSum = 0;
        int n = s.length();
        int [] prefixSum0 = new int [n+1];
        int [] prefixSum1 = new int [n+1];
        for(int i = 0; i<n; i++){
            prefixSum0[i+1] = prefixSum0[i];
            if(s.charAt(i) == '0'){
                prefixSum0[i+1] = prefixSum0[i] + 1;
            }
        }
        for(int i = n-1; i>=0;i--){
            prefixSum1[i] = prefixSum1[i+1];
            if(s.charAt(i) == '1'){
                prefixSum1[i] = prefixSum1[i+1] + 1;
            }
        }
        for(int i = 0; i<n-1; i++){
            int currSum = prefixSum0[i+1] + prefixSum1[i+1];
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}