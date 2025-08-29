import java.util.*;

class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        if (s == null) return result;
        
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(s);
        visited.add(s);
        boolean found = false;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String str = queue.poll();
                if (isValid(str)) {
                    result.add(str);
                    found = true;
                }
                if (!found) {
                    for (int j = 0; j < str.length(); j++) {
                        if (str.charAt(j) != '(' && str.charAt(j) != ')') continue;
                        String newStr = str.substring(0, j) + str.substring(j + 1);
                        if (!visited.contains(newStr)) {
                            visited.add(newStr);
                            queue.offer(newStr);
                        }
                    }
                }
            }
            if (found) break;
        }
        return result;
    }
    
    private boolean isValid(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') count++;
            else if (c == ')') {
                if (count == 0) return false;
                count--;
            }
        }
        return count == 0;
    }
}