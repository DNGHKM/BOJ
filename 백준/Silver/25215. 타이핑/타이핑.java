import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        int small = 0;
        int big = 0;
        boolean capital = false;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('a' <= c && c <= 'z') {
                small++;
                if (capital) {
                    list.add(big);
                    big = 0;
                }
                capital = false;
            } else {
                if (!capital) {
                    list.add(small);
                    small = 0;
                }
                capital = true;
                big++;
            }
        }
        int last = big == 0 ? small : big;
        list.add(last);

        boolean skip = false;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) == 1 && !skip) {
                skip = true;
                continue;
            }
            skip = false;
            sum++;
        }

        if (skip) sum++;
        System.out.println(sum + s.length());
    }
}