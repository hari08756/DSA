class Solution {
    public int countOdds(int low, int high) {
        int oddNo = (high - low ) / 2;
        if(low % 2 == 0 && high % 2 == 0) return oddNo;
        return oddNo + 1;
    }
}