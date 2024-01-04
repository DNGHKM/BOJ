import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i <s.length(); i++) {
            arr.add(s.substring(i));
        }
        arr.sort(Comparator.naturalOrder());
        for (String a : arr) {
            System.out.println(a);
        }
    }
}