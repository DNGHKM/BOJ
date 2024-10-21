import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] happy = {'H', 'A', 'P', 'Y'};
        char[] sad = {'S', 'A', 'D'};
        int happyPoint = 0;
        int sadPoint = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < happy.length; j++) {
                for (int k = 0; k < happy.length; k++) {
                    if (happy[k] == c) {
                        happyPoint++;
                    }
                }
                for (int k = 0; k < sad.length; k++) {
                    if (sad[k] == c) {
                        sadPoint++;
                    }
                }
            }
        }
        if (happyPoint == 0 && sadPoint == 0) {
            System.out.println("50.00");
            return;
        }
        String ans = String.format("%.2f", ((double) happyPoint / (happyPoint + sadPoint) * 100));
        System.out.println(ans);
    }
}