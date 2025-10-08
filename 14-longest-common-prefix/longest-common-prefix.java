class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        StringBuilder prefix = new StringBuilder(strs[0]);
        
        for (int i = 1; i < strs.length; i++) {
            String current = strs[i];
            int j = 0;
            
            // Compare characters until mismatch
            while (j < prefix.length() && j < current.length() && 
                   prefix.charAt(j) == current.charAt(j)) {
                j++;
            }
            
            // Trim prefix to common length
            prefix.setLength(j);
            
            if (prefix.length() == 0) {
                return "";
            }
        }
        
        return prefix.toString();
    }
}