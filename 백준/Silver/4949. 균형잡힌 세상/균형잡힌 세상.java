import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        boolean bool = true;
        while(bool) {
            String str = br.readLine();
            if(str.length()==1&&str.charAt(0)=='.'){
                bool=false;
                continue;
            }
            for (int i = 0; i < str.length(); i++) {
                char input = str.charAt(i);
                if (input == '(' || input == '[') {
                    stack.push(input);
                }
                if (input == ')') {
                    if (!stack.empty() && stack.peek() == '(') {
                        stack.pop();
                    } else{
                        stack.push('*');
                    }
                }
                if (input == ']') {
                    if (!stack.empty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        stack.push('*');
                    }
                }
            }
            if (stack.empty()){
                System.out.println("yes");
            } else{
                System.out.println("no");
            }
            stack.clear();
        }
    }
}