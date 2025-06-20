import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<String, Character> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        map.put("000000", 'A');
        map.put("001111", 'B');
        map.put("010011", 'C');
        map.put("011100", 'D');
        map.put("100110", 'E');
        map.put("101001", 'F');
        map.put("110101", 'G');
        map.put("111010", 'H');
        for (int i = 0; i < s.length(); i += 6) {
            String split = s.substring(i, i + 6);
            Character c = check(split);
            if (c == '-') {
                System.out.println(i / 6 + 1);
                return;
            }
            sb.append(c);
        }
        System.out.println(sb);
    }

    private static Character check(String binary) {
        if (map.containsKey(binary)) {
            return map.get(binary);
        }
        for (int i = 0; i < binary.length(); i++) {
            char[] chars = binary.toCharArray();
            chars[i] = (chars[i] == '0') ? '1' : '0';
            String newBinary = new String(chars);
            if (map.containsKey(newBinary)) {
                return map.get(newBinary);
            }
        }
        return '-';
    }
}

