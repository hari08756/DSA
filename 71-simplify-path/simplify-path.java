import java.util.*;

class Solution {
    public String simplifyPath(String path) {
        String[] tokens = path.split("/");
        List<String> stack = new ArrayList<>();
        
        for (String token : tokens) {
            if (token.equals("") || token.equals(".")) {
                continue;
            } else if (token.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.remove(stack.size() - 1);
                }
            } else {
                stack.add(token);
            }
        }
        
        return "/" + String.join("/", stack);
    }
}