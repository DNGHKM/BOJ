import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt() / 2;
        int b = sc.nextInt();
        int m = a + b;
        System.out.println(Math.min(n, m));
    }
}
