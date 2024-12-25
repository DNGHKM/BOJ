import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num;
            if (num < minA) {
                minA = num;
            }
        }
        for (int i = 0; i < 2; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num;
            if (num < minB) {
                minB = num;
            }
        }
        System.out.println(sum-minA-minB);
    }
}