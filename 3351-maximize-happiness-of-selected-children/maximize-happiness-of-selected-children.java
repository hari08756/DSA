class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long maxChild = 0;
        int p = 0;
        for(int i = happiness.length - 1; i >= 0; i--){
            if(happiness[i] <= p || k == 0){
                break;
            }else{
                maxChild += happiness[i] - p;
                k--;
                p++;
            }
        }
        return maxChild;
    }
}