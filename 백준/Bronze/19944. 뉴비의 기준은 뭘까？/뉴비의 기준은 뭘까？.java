import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(m<=2){
            System.out.println("NEWBIE!");
            return;
        }
        if(m<=n){
            System.out.println("OLDBIE!");
            return;
        }
        System.out.println("TLE!");
    }
}