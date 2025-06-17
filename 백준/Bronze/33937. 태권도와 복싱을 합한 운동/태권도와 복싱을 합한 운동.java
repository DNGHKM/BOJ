import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String pick1 = pick(s1);
        String pick2 = pick(s2);
        if (pick1 == null || pick2 == null) {
            System.out.println("no such exercise");
            return;
        }
        System.out.println(pick1 + pick2);
    }

    private static String pick(String s) {
        Set<Character> set = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u'));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            sb.append(c);
            if (set.contains(c) && !set.contains(s.charAt(i + 1))) {
                return sb.toString();
            }
        }
        return null;
    }
}