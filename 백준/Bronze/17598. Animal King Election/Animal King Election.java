import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        int t = 0;
        int l = 0;
        for (int i = 0; i < 9; i++) {
            String s = sc.nextLine();
            if (s.equals("Tiger")) {
                t++;
                continue;
            }
            l++;
        }
        if (t > l) {
            System.out.println("Tiger");
        }else{
            System.out.println("Lion");
        }
    }
}