import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        sb.append("1".repeat(Math.max(0, a)));
        sum += Integer.parseInt(sb.toString());
        sb = new StringBuilder();
        sb.append("1".repeat(Math.max(0, b)));
        sum += Integer.parseInt(sb.toString());
        System.out.println(sum);
    }
}