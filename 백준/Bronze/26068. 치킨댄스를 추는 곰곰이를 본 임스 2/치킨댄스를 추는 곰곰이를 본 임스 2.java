import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.nextLine().replaceAll("D-", ""));
            if (num <= 90) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
