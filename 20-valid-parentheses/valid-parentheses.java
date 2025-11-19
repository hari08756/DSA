class Solution {
    boolean isValidString(Stack<Character> st, char c){
        if(c == '(' || c == '[' || c == '{'){
            st.push(c);
            return true;
        }
        if(st.size() == 0) return false;
        if(c == ')'){
            if(st.peek() == '('){
                st.pop();
                return true;
            }
        }
        if(c == ']'){
            if(st.peek() == '['){
                st.pop();
                return true;
            }
        }
        if(c == '}'){
            if(st.peek() == '{'){
                st.pop();
                return true;
            }
        }
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        if(n%2 != 0) return false;
        for(int i = 0; i<n; i++){
            char c = s.charAt(i);
            if(!isValidString(st,c)){
                return false;
            }
        }
        if(st.size() != 0) return false;
        return true;
    }
}