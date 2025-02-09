import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int tmp = n * 5 - 400;
        sb.append(tmp + "\n");
        if (tmp < 100) {
            sb.append(1);
        } else if (tmp > 100) {
            sb.append(-1);
        } else {
            sb.append(0);
        }
        System.out.println(sb);
    }
}