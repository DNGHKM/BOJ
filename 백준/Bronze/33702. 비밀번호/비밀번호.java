import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = n % 2 == 0 ? 0 : 8;
        System.out.println(ans);
    }
}
