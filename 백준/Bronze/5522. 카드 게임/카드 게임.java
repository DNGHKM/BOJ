import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int point =0;
        for (int i = 0; i <5; i++) {
            point+=sc.nextInt();
        }
        System.out.println(point);
    }
}