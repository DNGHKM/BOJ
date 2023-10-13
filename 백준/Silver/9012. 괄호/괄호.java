import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Character> st = new Stack<>();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i <n; i++) {
            boolean bool = true;
            String input = sc.next();
            for (int j = 0; j <input.length(); j++) {
                if(input.charAt(j)=='('){
                    st.push(input.charAt(j));
                } else if(st.empty()){
                    result.append("NO\n");
                    bool = false;
                    break;
                } else {
                    st.pop();
                }
            }
            if (bool&&st.empty()){
                result.append("YES\n");
            } else if(bool) {
                result.append("NO\n");
            }
            st.clear();
        }
        System.out.println(result);
    }
}
