import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputArr = new int[n];
        StringBuilder result = new StringBuilder();
        boolean bool = true;
        for (int i = 0; i <n; i++) {
            inputArr[i]=sc.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        int num = 1;
        for (int i = 0; i <inputArr.length; i++) {
            int inputNum = inputArr[i];
                if (inputNum >= num) {
                    while (inputNum >= num) {
                        st.push(num);
                        num++;
                        result.append("+\n");
                    }
                    st.pop();
                    result.append("-\n");
                } else {
                    int pop = st.pop();
                    if(pop>inputNum){
                        System.out.println("NO");
                        bool=false;
                        break;
                    }else{
                        result.append("-\n");
                    }
                }
        }
        if(bool) System.out.println(result);
    }
}