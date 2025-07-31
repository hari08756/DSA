class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0){
            return false;
        }
        else{
            int revx = 0, num = 0, x1 = x;
            while(x>0){
                num = x%10;
                revx = revx*10 + num;
                x/=10;
            }
            if(x1==revx){
                return true;
            }
            else return false;

        }
        
    }
}