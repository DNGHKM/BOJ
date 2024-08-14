import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = -1;
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
        }
        System.out.println("YES\n" + num * 111);
    }
}