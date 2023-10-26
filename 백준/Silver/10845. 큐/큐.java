import java.io.*;
import java.util.*;

public class Main {
    static int num;
    static String input;
    static int[] arr;
    static int pushIndex;
    static int pollIndex;
    static BufferedWriter bw;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        pushIndex = arr.length-1;
        pollIndex=arr.length-1;
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
                    pop();
                    break;
                case "size":
                    sizeStack();
                    break;
                case "empty":
                    emptyStack();
                    break;
                case "front":
                    front();
                    break;
                case "back":
                    back();
                    break;
            }
        }
        bw.flush();
    }
    private static void push(int num) {
        arr[pushIndex--]=num;
    }
    private static void pop() throws IOException {
        if(pushIndex==pollIndex){
            bw.write(-1+"\n");
        }else {
            int tmp =arr[pollIndex];
            pollIndex--;
            bw.write(tmp+"\n");
        }
    }
    private static void sizeStack() throws IOException{
        bw.write(pollIndex-pushIndex+"\n");
    }
    private static void emptyStack() throws IOException{
        if(pushIndex==pollIndex){
            bw.write(1+"\n");
        }else{
            bw.write(0+"\n");
        }
    }
    private static void front() throws IOException {
        if (pushIndex == pollIndex) {
            bw.write(-1 + "\n");
        } else {
            bw.write(arr[pollIndex] + "\n");
        }
    }
    private static void back() throws IOException{
        if(pushIndex==pollIndex){
            bw.write(-1+"\n");
        } else{
            bw.write(arr[pushIndex+1]+"\n");
        }
    }
}
