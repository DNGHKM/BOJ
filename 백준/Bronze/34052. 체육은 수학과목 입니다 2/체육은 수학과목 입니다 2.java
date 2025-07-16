import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += sc.nextInt();
        }
        if (sum + 300 <= 1800) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}

