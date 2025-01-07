import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int inner = 0;
            int outer = 0;
            int cur = a;
            while (cur != b) {
                cur++;
                inner++;
                if (cur == 244) {
                    cur = 201;
                }
            }
            cur = a;
            while (cur != b) {
                cur--;
                outer++;
                if (cur == 200) {
                    cur = 243;
                }
            }
            if(inner<outer){
                sb.append("Inner circle line\n");
            }else if(inner>outer){
                sb.append("Outer circle line\n");
            }else{
                sb.append("Same\n");
            }
        }
        System.out.println(sb);
    }
}