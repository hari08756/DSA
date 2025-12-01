class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = shifts.length;
        int [] prefixSum = new int [n];
        prefixSum[n-1] = shifts[n-1]%26;
        for(int i = n-2; i>=0; i--){
            prefixSum[i] = prefixSum[i+1] + shifts[i];
            prefixSum[i] %= 26;
        }
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i<n; i++){
            sb.setCharAt(i,(char)('a' +(sb.charAt(i) -'a' + prefixSum[i])%26));
            s = sb.toString();
        }
        return s;
    }
}