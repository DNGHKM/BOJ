import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean rise = true;
        boolean dive = true;
        boolean equal = true;
        int num = sc.nextInt();
        for (int i = 0; i < 3; i++) {
            int input = sc.nextInt();
            if (num <= input) {
                dive = false;
            }
            if (num >= input) {
                rise = false;
            }
            if (num != input) {
                equal = false;
            }
            num = input;
        }
        if (equal) {
            System.out.println("Fish At Constant Depth");
            return;
        }
        if (dive) {
            System.out.println("Fish Diving");
            return;
        }
        if (rise) {
            System.out.println("Fish Rising");
            return;
        }
        System.out.println("No Fish");
    }
}