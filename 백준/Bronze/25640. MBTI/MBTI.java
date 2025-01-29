import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if(sc.nextLine().equals(s)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}