import java.io.*;
import java.util.*;

public class Main {
    static int num;
    static String input;
    static int[] arr;
    static int leftIndex;
    static int rightIndex;
    static BufferedWriter bw;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        arr = new int[2*n];
        leftIndex = n;
        rightIndex= n;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            input = st.nextToken();
            if(st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }
            switch (input) {
                case "push_back":
                    push_back(num);
                    break;
                case "push_front":
                    push_front(num);
                    break;
                case "pop_front":
                    pop_front();
                    break;
                case "pop_back":
                    pop_back();
                    break;
                case "size":
                    sizeDeque();
                    break;
                case "empty":
                    emptyDeque();
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
    private static void push_back(int num) {
        arr[leftIndex--]=num;
    }
    private static void push_front(int num) {
        arr[++rightIndex]=num;
    }
    private static void pop_front() throws IOException {
        if(leftIndex==rightIndex){
            bw.write(-1+"\n");
        }else {
            int tmp =arr[rightIndex];
            rightIndex--;
            bw.write(tmp+"\n");
        }
    }
    private static void pop_back() throws IOException {
        if(leftIndex==rightIndex){
            bw.write(-1+"\n");
        }else {
            int tmp =arr[leftIndex+1];
            leftIndex++;
            bw.write(tmp+"\n");
        }
    }
    private static void sizeDeque() throws IOException{
        bw.write(rightIndex-leftIndex+"\n");
    }
    private static void emptyDeque() throws IOException{
        if(leftIndex==rightIndex){
            bw.write(1+"\n");
        }else{
            bw.write(0+"\n");
        }
    }
    private static void front() throws IOException {
        if (leftIndex == rightIndex) {
            bw.write(-1 + "\n");
        } else {
            bw.write(arr[rightIndex] + "\n");
        }
    }
    private static void back() throws IOException{
        if(leftIndex==rightIndex){
            bw.write(-1+"\n");
        } else{
            bw.write(arr[leftIndex+1]+"\n");
        }
    }
}
