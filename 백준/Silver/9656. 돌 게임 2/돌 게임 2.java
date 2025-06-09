import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String winner = n % 2 == 0 ? "SK" : "CY";
        System.out.println(winner);
    }
}