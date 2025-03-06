import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        System.out.println((int) Math.round((double) (d * d) / 4));
    }
}