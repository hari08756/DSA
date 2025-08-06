class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==0) return true;
        int low=0;
        int high = num;
        while(low<=high){
            int mid = low + (high-low)/2;
            long sq = (long) mid*mid;
            if(sq==num) return true;
            else if (sq>num) high = mid-1;
            else low = mid+1;
        }
        if(high*high== num) return true;
        else return false;
    }
}