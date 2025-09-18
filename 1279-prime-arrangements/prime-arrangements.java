class Solution {
    private static final int MOD = 1000000007;

    public int numPrimeArrangements(int n) {
        int primeCount = countPrimes(n);
        int compositeCount = n - primeCount;
        
        long primeFactorial = factorial(primeCount);
        long compositeFactorial = factorial(compositeCount);
        
        return (int) ((primeFactorial * compositeFactorial) % MOD);
    }
    
    private int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }
    
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    private long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = (result * i) % MOD;
        }
        return result;
    }
}