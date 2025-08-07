
class Solution {
    public boolean judgeSquareSum(int c) {
        if(c==0) return true;
        int low = 0;
        int high = c;
        while(low<=high){
            int mid = low + (high-low)/2;
            long sq = (long) mid*mid; 
            if(sq== c) return true;
            else if(sq > c) high = mid-1;
            else low = mid+1;
            
        }
        int b=high;
        int a=1;
        while(a<=b){
            long s =(long) a*a + (long) b*b;
            if(s==c) return true;
            else if (s>c) b--;
            else a++;
        }
        if(b*b==c) return true;
        else return false;
    }
}