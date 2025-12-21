class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxOne = 0;
        int idx = 0;
        int m = mat.length;
        int n = mat[0].length;
        for(int i = 0; i<m; i++){
            int currCount = 0;
            for(int j = 0; j<n; j++){
                if(mat[i][j] == 1){
                    currCount++;
                }
            }
            if(currCount > maxOne){
                maxOne = currCount;
                idx = i;
            }
        }
        int [] a = new int [2];
        a[0] = idx;
        a[1] = maxOne;
        return a;
    }
}