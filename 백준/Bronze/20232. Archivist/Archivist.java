import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1996, "SPbSU");
        map.put(1997, "SPbSU");
        map.put(2000, "SPbSU");
        map.put(2006, "PetrSU, ITMO");
        map.put(2007, "SPbSU");
        map.put(2008, "SPbSU");
        map.put(2013, "SPbSU");
        map.put(2018, "SPbSU");

        if (map.containsKey(year)) {
            System.out.println(map.get(year));
            return;
        }
        System.out.println("ITMO");
    }
}