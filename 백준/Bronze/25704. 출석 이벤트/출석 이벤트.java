import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int min = p;
        if (n >= 5) {
            min = Math.min(min, p - 500);
        }
        if (n >= 10) {
            min = Math.min(min, p * 9 / 10);
        }
        if (n >= 15) {
            min = Math.min(min, p - 2000);
        }
        if(n>=20){
            min = Math.min(min, p * 75 / 100);
        }
        System.out.println(Math.max(min, 0));
    }
}