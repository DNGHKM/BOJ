import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if (arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) {
            System.out.println(1);
            return;
        }
        if (arr[0] == arr[1] && arr[1] == arr[2]) {
            System.out.println(2);
            return;
        }
        System.out.println(0);
    }
}
