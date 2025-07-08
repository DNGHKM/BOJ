import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, 1);
        }

        String mobis = "MOBIS";
        for (int i = 0; i < mobis.length(); i++) {
            char c = mobis.charAt(i);
            if (!map.containsKey(c)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}