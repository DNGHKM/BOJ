import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int length = n-k;
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        stack.push(str.charAt(0) - '0');
        for (int i = 1; i <str.length(); i++) {
            int num = str.charAt(i)-'0';
            while(!stack.isEmpty()&&stack.peek()<num&&k>0){
                stack.pop();
                k--;
            }
            stack.add(num);
        }
        for (Integer i : stack) {
            if(sb.length()<length){
                sb.append(i);
            }
        }
        System.out.print(sb);
    }
}