import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();
        int ans = (w - k) % m == 0 ? (w - k) / m : (w - k) / m + 1;
        System.out.println(ans);
    }
}