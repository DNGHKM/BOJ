import java.io.*;
import java.util.*;

public class Main {
    static int num;
    static String input;
    static int[] arr;
    static int index=-1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            input = st.nextToken();
            if(st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }
            switch (input) {
                case "push":
                    push(num);
                    break;
                case "pop":
                    bw.write(pop()+"\n");
                    break;
                case "size":
                    bw.write(sizeStack()+"\n");
                    break;
                case "empty":
                    bw.write(emptyStack()+"\n");
                    break;
                case "top":
                    bw.write(top()+"\n");
                    break;
            }
            bw.flush();
        }
    }
    private static void push(int num) {
        arr[++index]=num;
    }
    private static int pop() {
        if(index==-1){
            return -1;
        }else {
            int tmp =arr[index];
            index--;
            return tmp;
        }
    }
    private static int sizeStack() {
        return index+1;
    }
    private static int emptyStack() {
        if(index==-1){
            return 1;
        }else{
            return 0;
        }
    }
    private static int top() {
        if(index ==-1){
            return -1;
        } else{
            return arr[index];
        }
    }
}
