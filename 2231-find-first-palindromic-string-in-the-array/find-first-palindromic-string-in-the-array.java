class Solution {
    private boolean isPalindrom(String s){
        for(int left = 0, right = s.length() -1; left<right; left++, right--){
            if(s.charAt(left) != s.charAt(right)) return false;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        int n = words.length;
        for(int i = 0; i<n; i++){
            if(isPalindrom(words[i])) return words[i];
        }
        return "";
    }
}