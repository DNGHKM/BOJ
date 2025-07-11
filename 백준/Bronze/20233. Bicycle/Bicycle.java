import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = sc.nextInt();
        int b = sc.nextInt();
        int y = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(a + Math.max((t - 30) * x, 0) * 21 + " " + (b + Math.max((t - 45) * y, 0) * 21));
    }
}