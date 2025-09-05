class Solution {
    public boolean isPowerOfTwo(int n) {
        int po = 1;
        int b = n;
        while(b>1){
            po = po*2;
            b = b/2; 
        }
        if(n<=0 || n != po){
            return false;
        }else{
            return true;
        }

    }
}