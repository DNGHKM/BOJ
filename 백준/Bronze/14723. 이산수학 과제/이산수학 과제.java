import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = findNum(n);
        int idx = n - num * (num - 1) / 2;
        System.out.println((num + 1 - idx) + " " + idx);
    }

    private static int findNum(int i) {
        int num = 1;
        while (true) {
            if (num * (num + 1) / 2 >= i) {
                return num;
            }
            num++;
        }
    }
}