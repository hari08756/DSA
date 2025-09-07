class Solution {
    int fibo(int n){
        int fibn =0;
        if(n<2) return n;
        else {
            fibn = fibo(n-1) + fibo(n-2);
        }
        return fibn;
    }
    public int fib(int n) {
        return fibo(n);
    }
}