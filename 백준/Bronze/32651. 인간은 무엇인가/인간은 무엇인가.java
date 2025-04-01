import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2024 == 0 && n <= 100000) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}