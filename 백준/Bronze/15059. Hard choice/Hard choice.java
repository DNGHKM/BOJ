import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            int want = sc.nextInt();
            if (arr[i] < want) {
                sum += arr[i] - want;
            }
        }
        System.out.println(-sum);
    }
}