class Solution {
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n<=2) return 1;
        int f = 0;
        int s = 1;
        int t = 1;
        for(int i = 3; i<=n; i++){
            int temp1 = t;
            int temp2 = s;
            t += f + s;
            f = temp2;
            s = temp1;

        }
        return t;
    }
}