class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int maxApple = 0;
        for(int n : apple) maxApple += n;
        int minBox = 0;
        for(int i = capacity.length -1; i>=0; i--){
            maxApple -= capacity[i];
            minBox++;
            if(maxApple <= 0) break;
        }
        return minBox;
    }
}