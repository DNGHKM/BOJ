import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.add(c);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            if (stack.peek() == '(') {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}