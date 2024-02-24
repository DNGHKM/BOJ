import java.io.*;
import java.util.*;

class Main {
    static int n;
    static int[] arr;
    static int[] ans;
    static int count = 0;
    static int k;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[n+1];
        arr[0] = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <n+1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        heapSort();
        if(count>=k) {
            for (int i = 1; i <ans.length; i++) {
                bw.write(ans[i]+" ");
            }
        }else{
            System.out.println(-1);
            return;
        }
        bw.flush();
    }
    private static void heapSort() {
        buildMinHeap(n);
        for (int i = n; i >= 2; i--) {
            int tmp = arr[1];
            arr[1] = arr[i];
            arr[i] = tmp;
            count++;
            if(count==k){
                ans = arr.clone();
            }
            heapify(arr, 1, i - 1);
        }
    }
    private static void buildMinHeap(int n) {
        for (int i = n; i >= 1; i--) {
            heapify(arr, i, n);
        }
    }
    private static void heapify(int[] arr, int i, int n) {
        int left = 2*i;
        int right = 2*i+1;
        int smaller;
        if(right<=n){
            if(arr[left]<arr[right]){
                smaller = left;
            }else{
                smaller = right;
            }
        }else if(left<=n){
            smaller = left;
        }else {
            return;
        }
        if(arr[smaller]<arr[i]){
            int tmp = arr[i];
            arr[i] = arr[smaller];
            arr[smaller]=tmp;
            count ++;
            if(count==k){
                ans = arr.clone();
            }
            heapify(arr, smaller, n);
        }
    }
}