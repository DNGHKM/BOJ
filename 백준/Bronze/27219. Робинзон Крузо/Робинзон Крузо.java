import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String sb = "V".repeat(Math.max(0, n / 5)) +
                "I".repeat(Math.max(0, n % 5));
        System.out.println(sb);
    }
}