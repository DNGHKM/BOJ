import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        int idx = n / 2;
        int num = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            arr[idx] = i;
            arr2[i - 1] = idx + 1;
            if (i % 2 == 1) {
                idx -= num;
            } else {
                idx += num;
            }
            num++;
        }
        Arrays.stream(arr).forEach(i -> sb.append(i + " "));
        sb.append("\n");
        Arrays.stream(arr2).forEach(i -> sb.append(i + " "));
        System.out.println("YES\n" + sb);
    }
}