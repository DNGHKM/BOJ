import java.util.*;

class Main {
    static StringBuilder sb;
    static StringBuilder sb2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        sb = new StringBuilder(s);
        if(n!=1) {
            sb2 = new StringBuilder();
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < s.length(); j++) {
                    if (j == 0) {
                        changeColor(s.length() - 1, j, j + 1);
                    } else if (j == s.length() - 1) {
                        changeColor(j - 1, j, 0);
                    } else {
                        changeColor(j - 1, j, j + 1);
                    }
                }
                sb = new StringBuilder(sb2);
                sb2 = new StringBuilder();
            }
        }
        int red = 0, green = 0, blue = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'R') {
                red++;
            } else if (sb.charAt(i) == 'G') {
                green++;
            } else {
                blue++;
            }
        }
        System.out.println(red + " " + green + " " + blue);
    }

    private static void changeColor(int left, int mid, int right) {
        char l = sb.charAt(left);
        char m = sb.charAt(mid);
        char r = sb.charAt(right);
        char[] arr = {l, m, r};
        int red = 0;
        int blue = 0;
        int green = 0;
        for (char c : arr) {
            if (c == 'R') {
                red++;
            } else if (c == 'B') {
                blue++;
            } else {
                green++;
            }
        }
        if ((l == m && m == r) || (l != m && m != r && r != l)) {
            sb2.append("B");
        } else {
            if ((red == 2 && green == 1) || (green == 2 && blue == 1) || (blue == 2 && red == 1)) {
                sb2.append("R");
            } else {
                sb2.append("G");
            }
        }
    }
}