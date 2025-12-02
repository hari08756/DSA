class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int [] altitude = new int [n+1];
        int maxAlt = 0;
        for(int i = 0; i<n; i++){
            altitude[i+1] = altitude[i] + gain[i];
            maxAlt = Math.max(altitude[i+1],maxAlt);
        }
        return maxAlt;
    }
}