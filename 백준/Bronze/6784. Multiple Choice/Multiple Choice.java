import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = sc.nextLine();
        }
        int point = 0;
        for (int i = 0; i < n; i++) {
            if (ans[i].equals(sc.nextLine())) {
                point++;
            }
        }
        System.out.println(point);
    }
}