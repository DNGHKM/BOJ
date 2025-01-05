import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine().replaceAll(" ", "");
            int score = 0;
            for (int j = 0; j < input.length(); j++) {
                score += input.charAt(j) - 64;
            }
            sb.append(score == 100 ? "PERFECT LIFE\n" : score + "\n");
        }
        System.out.println(sb);
    }
}