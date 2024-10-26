import java.util.Scanner;

public class Main {
    static boolean flag = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        pal(s);
        if (flag) {
            System.out.println("AKARAKA");
        } else {
            System.out.println("IPSELENTI");
        }
    }

    private static boolean pal(String s) {
        if (s.length() <= 1) {
            return true;
        }
        if (isSame(s)) {
            flag = pal(s.substring(0, s.length() / 2)) && pal(s.substring((s.length() + 1) / 2));
        } else {
            flag = false;
        }
        return flag;
    }

    private static boolean isSame(String s) {
        int leftIdx = 0;
        int rightIdx = s.length() - 1;
        while (leftIdx <= rightIdx) {
            if (s.charAt(leftIdx) == s.charAt(rightIdx)) {
                leftIdx++;
                rightIdx--;
            } else {
                return false;
            }
        }
        return true;
    }
}