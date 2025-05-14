import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(sc.next().equals(sc.next())){
                sb.append("OK\n");
                continue;
            }
            sb.append("ERROR\n");
        }
        System.out.println(sb);
    }
}