class Solution {
    public int pivotInteger(int n) {
        int left = n*(n+1)/2;
        int right = n;
        int k = n-1;
        while(left > right ){
            left -= k+1;
            right += k;
            k--;
        }
        if(left == right) return k+1;
        return -1;
    }
}