import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 1;
        for (int i = 0; i <n; i++) {
            arr[i] = i+1;
            }
        int start = 1;
        int finish = 1;
        int count =0;
        while(start<=n&&finish<=n) {
            if (n > sum) {
                finish++;
                sum += finish;
            } else if (n == sum) {
                count++;
                finish++;
                sum+=finish;
            } else {
                sum -= start;
                start++;
            }
        }
        System.out.println(count);
    }
}