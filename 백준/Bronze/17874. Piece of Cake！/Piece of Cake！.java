import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = {(n - a) * (n - b), (n - a) * b, a * b, a * (n - b)};
        int max = -1;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        System.out.println(max*4);
    }
}