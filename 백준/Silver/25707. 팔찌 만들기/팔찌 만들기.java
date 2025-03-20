import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1;
        int min = Integer.MAX_VALUE;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        System.out.println(2 * (max - min));
    }
}