class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<=1) return false;
        int div = 1;
        for(int i=2; i<=num/2; i++){
            if(num%i == 0){
                div += i;
            }
        }
        if(num % div == 0 && div != 1) return true;
        return false;
    }
}