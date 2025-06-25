import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exceed = -(sc.nextInt() - sc.nextInt());
        if (exceed <= 0) {
            System.out.println("Congratulations, you are within the speed limit!");
            return;
        }
        int fine;
        if (exceed <= 20) {
            fine = 100;
        } else if (exceed <= 30) {
            fine = 270;
        } else {
            fine = 500;
        }
        System.out.printf("You are speeding and your fine is $%d.", fine);
    }
}