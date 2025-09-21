class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j) - '0' : 0;
            
            int total = digitA + digitB + carry;
            result.append(total % 2);  // Get the current digit
            carry = total / 2;         // Calculate carry for next iteration
            
            i--;
            j--;
        }
        
        return result.reverse().toString();
    }
}