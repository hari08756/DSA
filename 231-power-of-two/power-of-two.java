class Solution {
    public static int pow(int a, int b){
        int po = 1;
        while(b>1){
            po = po*2;
            b = b/2; 
        }
        return po;
    }
    public boolean isPowerOfTwo(int n) {
        if(n<=0 || n != pow(2,n)){
            return false;
        }else{
            return true;
        }

    }
}