class Solution {
    public String reverseWords(String s) {
        if (s == null) return null;
        char[] sArr = s.toCharArray();
        int n = sArr.length;
        int newLen = removeExtraSpaces(sArr);
        if (newLen == 0) return "";
        reverse(sArr, 0, newLen - 1);
        int start = 0;
        for (int i = 0; i <= newLen; i++) {
            if (i == newLen || sArr[i] == ' ') {
                reverse(sArr, start, i - 1);
                start = i + 1;
            }
        }
        return new String(sArr, 0, newLen);
    }

    private int removeExtraSpaces(char[] sArr) {
        int n = sArr.length;
        int slow = 0;
        int fast = 0;
        while (fast < n && sArr[fast] == ' ') {
            fast++;
        }
        while (fast < n) {
            if (sArr[fast] != ' ') {
                sArr[slow++] = sArr[fast++];
            } else {
                sArr[slow++] = ' ';
                while (fast < n && sArr[fast] == ' ') {
                    fast++;
                }
            }
        }
        if (slow > 0 && sArr[slow - 1] == ' ') {
            slow--;
        }
        return slow;
    }

    private void reverse(char[] sArr, int left, int right) {
        while (left < right) {
            char temp = sArr[left];
            sArr[left] = sArr[right];
            sArr[right] = temp;
            left++;
            right--;
        }
    }
}