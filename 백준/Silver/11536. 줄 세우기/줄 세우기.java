import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        boolean asc = true;
        boolean desc = true;
        String cur = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(cur) > 0) {
                desc = false;
            } else {
                asc = false;
            }
            cur = arr[i];
        }
        if (asc) {
            System.out.println("INCREASING");
        } else if (desc) {
            System.out.println("DECREASING");
        } else {
            System.out.println("NEITHER");
        }
    }
}