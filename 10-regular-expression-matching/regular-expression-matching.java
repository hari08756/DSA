class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        
        // dp[i][j] will be true if s[0..i-1] matches p[0..j-1]
        boolean[][] dp = new boolean[m + 1][n + 1];
        
        // Empty pattern matches empty string
        dp[0][0] = true;
        
        // Handle patterns like a*, a*b*, a*b*c* that can match empty string
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);
                
                if (pc == '.' || sc == pc) {
                    // Current characters match, so result is same as previous state
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pc == '*') {
                    // '*' case: need to check the previous character in pattern
                    char prev = p.charAt(j - 2);
                    
                    // Zero occurrences of the character before *
                    dp[i][j] = dp[i][j - 2];
                    
                    // If the previous character matches or is '.', consider one or more occurrences
                    if (prev == '.' || prev == sc) {
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                    }
                } else {
                    // Characters don't match
                    dp[i][j] = false;
                }
            }
        }
        
        return dp[m][n];
    }
}