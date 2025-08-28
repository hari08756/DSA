class Solution {
    public String minWindow(String s, String t) {
        int[] map = new int[128];
        for (char c : t.toCharArray()) {
            map[c]++;
        }
        int left = 0, right = 0, minStart = 0, minLen = Integer.MAX_VALUE, counter = t.length();
        while (right < s.length()) {
            char c1 = s.charAt(right);
            if (map[c1] > 0) {
                counter--;
            }
            map[c1]--;
            right++;
            while (counter == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    minStart = left;
                }
                char c2 = s.charAt(left);
                map[c2]++;
                if (map[c2] > 0) {
                    counter++;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}