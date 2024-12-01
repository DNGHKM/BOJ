import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        if (odd >= even) {
            System.out.println("Sad");
        } else {
            System.out.println("Happy");
        }
    }
}