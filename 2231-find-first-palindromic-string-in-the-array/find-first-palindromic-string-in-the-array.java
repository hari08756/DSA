class Solution {
    private boolean isPalindrom(String s){
        for(int left = 0, right = s.length() -1; left<right; left++, right--){
            if(s.charAt(left) != s.charAt(right)) return false;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(int i = 0; i<words.length; i++){
            if(isPalindrom(words[i])) return words[i];
        }
        return "";
    }
}