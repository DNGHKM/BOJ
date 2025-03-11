import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 10;
        while (n > num) {
            n = (int) Math.round((double) n / num) * num;
            num *= 10;
        }
        System.out.println(n);
    }
}