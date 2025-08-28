class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        int n = s.length();
        if (n == 0) return false;
        
        boolean numberSeen = false;
        boolean dotSeen = false;
        boolean exponentSeen = false;
        boolean numberAfterExponent = false;
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                numberSeen = true;
                if (exponentSeen) numberAfterExponent = true;
            } else if (c == '.') {
                if (dotSeen || exponentSeen) return false;
                dotSeen = true;
            } else if (c == 'e' || c == 'E') {
                if (exponentSeen || !numberSeen) return false;
                exponentSeen = true;
                numberAfterExponent = false;
            } else if (c == '+' || c == '-') {
                if (i != 0 && s.charAt(i-1) != 'e' && s.charAt(i-1) != 'E') return false;
            } else {
                return false;
            }
        }
        
        return numberSeen && (exponentSeen ? numberAfterExponent : true);
    }
}