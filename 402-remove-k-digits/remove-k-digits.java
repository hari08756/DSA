class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length() == k) return "0";
        if(k == 0) return num;
        Stack<Character> stack = new Stack<>();
        for(int i =0; i<num.length(); i++){
            char c = num.charAt(i);
            while(!stack.isEmpty()&& k>0 && c<stack.peek()){
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        while(k>0){
            stack.pop();
            k--;
        }
        
        StringBuilder reversed = new StringBuilder();
        for(char c : stack){
            reversed.append(c);
        }
        while(reversed.charAt(0) == '0' && reversed.length() > 1){
            reversed.deleteCharAt(0);
        }
        return reversed.length() == 0 ? "0" : reversed.toString();
    }
}