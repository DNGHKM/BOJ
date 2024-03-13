import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        long[] arr = new long[100];
        arr[0] = arr[1] = arr[2] = 1;
        for (int i = 3; i < arr.length; i++) {
            arr[i] = arr[i - 3] + arr[i - 2];
        }
        for (int i = 0; i < t; i++) {
            sb.append(arr[sc.nextInt() - 1] + "\n");
        }
        System.out.print(sb);
    }
}