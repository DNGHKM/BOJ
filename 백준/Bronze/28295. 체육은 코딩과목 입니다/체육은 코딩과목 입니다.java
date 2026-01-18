import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0;
        for (int i = 0; i < 10; i++) {
            pos += sc.nextInt();
        }
        char dir;
        if (pos % 4 == 0) {
            dir = 'N';
        } else if (pos % 4 == 1) {
            dir = 'E';
        } else if (pos % 4 == 2) {
            dir = 'S';
        } else {
            dir = 'W';
        }
        System.out.print(dir);
    }
}