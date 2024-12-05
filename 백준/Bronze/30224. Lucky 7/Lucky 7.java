import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = n % 7 == 0 ? 1 : 0;
        int con = String.valueOf(n).contains("7") ? 10 : 0;
        int num = div + con;
        System.out.print(num % 10 + num / 10 * 2);
    }
}