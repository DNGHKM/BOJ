import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {1, 0};
        for (int i = 0; i < n; i++) {
            int b = arr[0] + arr[1];
            int a = arr[1];
            arr[0] = a;
            arr[1] = b;
        }
        System.out.println(arr[0]+" "+arr[1]);
    }
}