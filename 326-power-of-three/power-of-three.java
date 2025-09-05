class Solution {
    public static int pow(int b){
        int po = 1;
        while(b>1){
            po = po*3;
            b = b/3; 
        }
        return po;
    }
    public boolean isPowerOfThree(int n) {
        if(n<=0 || n != pow(n)){
            return false;
        }else{
            return true;
        }

    }
}