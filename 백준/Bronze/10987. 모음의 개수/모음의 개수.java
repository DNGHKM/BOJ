import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' ||c=='e'||c=='i'||c=='o'||c=='u') cnt++;
        }
        System.out.print(cnt);
    }
}