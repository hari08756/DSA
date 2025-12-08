class Solution {
    public int countTriples(int n) {
        int countTriplte = 0;
        for(int i = 1; i<n-1; i++){
            for(int j = i + 1; j<n; j++){
                for(int k = j+1; k<=n;k++){
                    if(Math.sqrt(i*i + j*j) == k){
                        countTriplte += 2;
                    }
                }
            }
        }
        return countTriplte;
    }
}