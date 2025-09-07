class Solution {
    int fibo(int n){
        int fibn =0;
        if(n<=0) return 0;
        else if(n==1) return 1;
        else {
            fibn = fibo(n-1) + fibo(n-2);
        }
        return fibn;
    }
    public int fib(int n) {
        return fibo(n);
    }
}