import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            char c = sc.next().charAt(0);
            for (int j = 0; j < a; j++) {
                sb.append(c);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}