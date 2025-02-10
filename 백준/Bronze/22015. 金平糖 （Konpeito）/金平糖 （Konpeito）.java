import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1;
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            sum += a;
            max = Math.max(max, a);
        }
        System.out.println(max * 3 - sum);
    }
}