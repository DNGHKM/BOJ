import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(Arrays.stream(a.split(" ")).filter(s -> s.equals(b)).count());
    }
}