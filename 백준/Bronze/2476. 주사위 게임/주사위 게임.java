import org.w3c.dom.ls.LSOutput;

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = -1;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, cal(sc));
        }
        System.out.println(max);
    }
    
    private static int cal(Scanner sc) {
        int[] arr = new int[7];
        for (int i = 0; i < 3; i++) {
            arr[sc.nextInt()]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3) {
                return 10000 + i * 1000;
            }
            if (arr[i] == 2) {
                return 1000 + i * 100;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                return i * 100;
            }
        }
        return 0;
    }
}