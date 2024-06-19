import java.util.*;

public class Main {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int num = 0;
            while((num+1)*(num+1)+num<n) num++;
            sb.append(num + "\n");
        }
        System.out.print(sb);
    }
}