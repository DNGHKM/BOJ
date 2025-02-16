import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            char c = s.charAt(0);
            sb.append(c);
            for (int j = 1; j < s.length(); j++) {
                if(c==s.charAt(j)){
                    continue;
                }
                sb.append(s.charAt(j));
                c = s.charAt(j);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}