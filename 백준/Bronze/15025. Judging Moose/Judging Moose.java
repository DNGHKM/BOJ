import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("Not a moose");
            return;
        }
        StringBuilder sb = new StringBuilder();

        if (a != b) {
            sb.append("Odd ");
        } else {
            sb.append("Even ");
        }
        sb.append(Math.max(a, b) * 2);
        System.out.println(sb);
    }
}