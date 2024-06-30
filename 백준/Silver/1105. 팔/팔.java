import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        if ((int) Math.log10(l) != (int) Math.log10(r)) {
            System.out.println(0);
            return;
        }
        int cnt = 0;
        int len = String.valueOf(l).length();
        for (int i = 0; i < len; i++) {
            char lc = String.valueOf(l).charAt(i);
            char rc = String.valueOf(r).charAt(i);
            if (lc == rc) {
                if(lc == '8'){
                    cnt++;
                }
            } else{
                break;
            }
        }
        System.out.println(cnt);
    }
}