class Solution {
    private String kthChar(String s, int k){
        if(k == 0 || s.length() >= k) return s;
        int n = s.length();
        for(int i = 0; i<n; i++){
            s += (char)('a' + (s.charAt(i) -'a' +1)%26);
        }
        return kthChar(s,k);
        
    }
    public char kthCharacter(int k) {
        if(k == 1) return 'a';
        String s = "a";
        int j = k;
        s = kthChar(s,j);
        return s.charAt(k-1);
    }
}