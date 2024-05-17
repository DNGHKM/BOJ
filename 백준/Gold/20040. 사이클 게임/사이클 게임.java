import java.io.*;
import java.util.*;

public class Main {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            count++;
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(find(a)!=find(b)){
                union(a, b);
            }else{
                System.out.print(count);
                return;
            }
        }
        System.out.print(0);
    }

    static void union(int a, int b) {
        int parentA = find(a);
        int parentB = find(b);
        if (parentA<parentB) {
            arr[parentB] = parentA;
        }else{
            arr[parentA] = parentB;
        }
    }

    static int find(int i) {
        if(arr[i]==i){
            return i;
        }
        return arr[i] = find(arr[i]);
    }
}