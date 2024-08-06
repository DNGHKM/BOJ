import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean minus = false;
        if (n < 0) {
            minus = true;
            n = -n;
        }
        if(n==0){
            System.out.println(0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        boolean carry = false;
        while (n > 0) {
            int mod = n % 3;
            if (mod == 2) {
                carry = true;
                n++;
                sb.append("T");
                continue;
            }
            if (!carry) {
                sb.append(mod);
            }
            carry = false;
            n /= 3;
        }
        if(minus){
            System.out.println(sb.reverse().toString().replaceAll("1", "A").replaceAll("T", "1").replaceAll("A", "T"));
            return;
        }
        System.out.println(sb.reverse());
    }
}