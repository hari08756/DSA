class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0; // Pointer for t
        int j = 0; // Pointer for s
        
        while (i < t.length() && j < s.length()) {
            if (t.charAt(i) == s.charAt(j)) {
                j++; 
            }
            i++; 
        }
        
        return j == s.length(); 
    }
}