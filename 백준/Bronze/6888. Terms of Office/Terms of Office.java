import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int curr = Integer.parseInt(br.readLine());
        int next = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (curr <= next) {
            sb.append("All positions change in year " + curr + "\n");
            curr += 60;
        }
        System.out.println(sb);
    }
}
