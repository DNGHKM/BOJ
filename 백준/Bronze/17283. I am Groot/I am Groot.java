import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int length = l * r / 100;
        int num = 2;
        int sum = length * num;
        while (true) {
            length = length * r / 100;
            if (length <= 5) {
                break;
            }
            num *= 2;
            sum += num * length;
        }
        System.out.println(sum);
    }
}