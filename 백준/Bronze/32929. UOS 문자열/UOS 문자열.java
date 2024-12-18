import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c;
        if (n % 3 == 0) {
            c = 'S';
        } else if (n % 3 == 1) {
            c = 'U';
        } else {
            c = 'O';
        }
        System.out.println(c);
    }
}