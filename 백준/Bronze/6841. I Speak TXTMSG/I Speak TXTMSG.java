import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        map.put("CU", "see you");
        map.put(":-)", "I’m happy");
        map.put(":-(", "I’m unhappy");
        map.put(";-)", "wink");
        map.put(":-P", "stick out my tongue");
        map.put("(~.~)", "sleepy");
        map.put("TA", "totally awesome");
        map.put("CCC", "Canadian Computing Competition");
        map.put("CUZ", "because");
        map.put("TY", "thank-you");
        map.put("YW", "you’re welcome");
        map.put("TTYL", "talk to you later");
        while (true) {
            String s = sc.nextLine();
            if (!map.containsKey(s)) {
                sb.append(s + "\n");
                continue;
            }
            sb.append(map.get(s) + "\n");
            if (s.equals("TTYL")) {
                break;
            }
        }
        System.out.println(sb);
    }
}

