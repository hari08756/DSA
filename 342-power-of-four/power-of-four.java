class Solution {
    public static int pow(int b){
        int po = 1;
        while(b>1){
            po = po*4;
            b = b/4; 
        }
        return po;
    }
    public boolean isPowerOfFour(int n){
        if(n<=0 || n != pow(n)){
            return false;
        }else{
            return true;
        }

    }
}