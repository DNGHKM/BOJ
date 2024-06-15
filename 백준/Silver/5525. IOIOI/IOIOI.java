import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        Stack<Character> stack = new Stack<>();
        int ans = 0;
        int len = n * 2 + 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty() && c == 'I') {
                stack.push(c);
                continue;
            }
            if (!stack.isEmpty()) {
                if ((stack.peek() == 'O' && c == 'I') || (stack.peek() == 'I' && c == 'O')) {
                    stack.push(c);
                } else {
                    if (stack.peek() == 'O') stack.pop();
                    if (stack.size() >= len) {
                        int count = (stack.size() - len) / 2 + 1;
                        if (count > 0) ans += count;
                    }
                    stack.clear();
                    if (c == 'I') stack.push(c);
                }
            }
        }
        if (stack.size() >= len) {
            int count = (stack.size() - len) / 2 + 1;
            if (count > 0) ans += count;
        }
        System.out.println(ans);
    }
}
