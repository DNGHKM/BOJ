import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int f1 = sc.nextInt();
        int f2 = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int usage = sc.nextInt();
            int bill = 0;
            if (usage <= 1000) {
                bill += usage * f1;
            } else {
                bill += 1000 * f1 + (usage - 1000) * f2;
            }
            sb.append(usage + " " + bill + "\n");
        }
        System.out.println(sb);
    }
}