class Solution {
    public boolean isPalindrome(int x) {
        int p = 0, n = 0, x1 = x;
        if(x<0){
            return false;
        }
        else{
            while(x>0){
                n = x%10;
                p = p*10 + n;
                x/=10;
            }
            if(x1==p){
                return true;
            }
            else return false;

        }
        
    }
}