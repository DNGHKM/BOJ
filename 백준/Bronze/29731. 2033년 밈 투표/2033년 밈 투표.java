import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] arr = {
                "Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "Never gonna stop"
        };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        boolean flag;
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            flag = Arrays.asList(arr).contains(s);
            if (!flag) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}