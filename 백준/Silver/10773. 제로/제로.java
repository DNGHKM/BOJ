import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i <n; i++) {
            int input = sc.nextInt();
            if(input!=0){
                st.push(input);
            }else{
                st.pop();
            }
        }
        while(!st.empty()){
            result+=st.pop();
        }
        System.out.println(result);
    }
}