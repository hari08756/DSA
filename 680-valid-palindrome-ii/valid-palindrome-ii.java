class Solution {
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() -1;
        while(l<r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }else{
                return isPal(s,l,r-1) || isPal(s,l+1,r);
            }    
        }
        return true;
    }
    public boolean isPal(String s, int l , int r){
        while(l<r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}