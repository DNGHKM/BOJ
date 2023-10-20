import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int n =Integer.parseInt(br.readLine());
        for (int i = 0; i <n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(st.nextToken());
            if(input == 1){
                int input2 = Integer.parseInt(st.nextToken());
                stack.push(input2);
            } else if(input ==2){
                if(!stack.isEmpty()){
                    bw.write(stack.pop()+"\n");
                } else{
                    bw.write(-1+"\n");
                }
            } else if(input ==3){
                bw.write(stack.size()+"\n");
            } else if(input ==4){
                if(stack.isEmpty()){
                    bw.write(1+"\n");
                }else{
                    bw.write(0+"\n");
                }
            } else if(input==5){
                if(!stack.isEmpty()){
                    bw.write(stack.peek()+"\n");
                } else{
                    bw.write(-1+"\n");
                }
            }
        }
        bw.flush();
     }
}