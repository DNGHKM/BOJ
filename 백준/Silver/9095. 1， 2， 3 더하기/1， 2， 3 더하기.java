import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        for (int i = 3; i <arr.length; i++) {
            arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
        }
        for (int i = 0; i < n; i++) {
            sb.append(arr[sc.nextInt()-1]).append("\n");
        }
        System.out.print(sb);
    }
}