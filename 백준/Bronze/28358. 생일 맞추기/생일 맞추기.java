import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int[] arr = new int[10];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                arr[j] = sc.nextInt();
            }

            LocalDate start = LocalDate.of(2024, 1, 1);
            LocalDate end = LocalDate.of(2024, 12, 31);
            LocalDate curr = start;

            int cnt = 0;
            while (!curr.isAfter(end)) {
                if (check(curr, arr)) {
                    cnt++;
                }
                curr = curr.plusDays(1);
            }
            sb.append(cnt + "\n");
        }
        System.out.println(sb);
    }

    private static boolean check(LocalDate curr, int[] arr) {
        String[] split = curr.toString().split("-");
        String month = String.valueOf(Integer.parseInt(split[1]));
        String day = String.valueOf(Integer.parseInt(split[2]));

        for (int i = 0; i < month.length(); i++) {
            if (arr[month.charAt(i) - '0'] == 1) {
                return false;
            }
        }

        for (int i = 0; i < day.length(); i++) {
            if (arr[day.charAt(i) - '0'] == 1) {
                return false;
            }
        }
        return true;
    }
}

