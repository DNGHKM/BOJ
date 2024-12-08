import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();
        if (k % m == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}