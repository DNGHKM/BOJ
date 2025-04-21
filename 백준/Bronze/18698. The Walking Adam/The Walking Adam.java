import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            int cnt = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'D') {
                    break;
                }
                cnt++;
            }
            sb.append(cnt + "\n");
        }
        System.out.println(sb);
    }
}