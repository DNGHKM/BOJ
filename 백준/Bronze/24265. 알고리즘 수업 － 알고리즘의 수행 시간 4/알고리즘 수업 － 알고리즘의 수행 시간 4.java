import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long count = 0;
        for (int i = 0; i <n; i++) {
            count+=i;
        }
            System.out.println(count);
            System.out.println(2);
    }
}