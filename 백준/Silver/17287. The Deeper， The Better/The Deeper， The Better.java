import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int point = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(isNum(c)){
                point = Math.max(point, calPoint(stack));
                continue;
            }
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
                continue;
            }
            stack.pop();
        }
        System.out.println(point);
    }

    private static int calPoint(Stack<Character> stack) {
        int sum = 0;
        for (Character c : stack) {
            if (c == '(') {
                sum += 1;
            }
            if (c == '{') {
                sum += 2;
            }
            if (c == '[') {
                sum += 3;
            }
        }
        return sum;
    }

    private static boolean isNum(char c) {
        return '0' <= c && c <= '9';
    }
}