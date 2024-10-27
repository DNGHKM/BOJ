import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()) * 56;
        int b = Integer.parseInt(st.nextToken()) * 24;
        int c = Integer.parseInt(st.nextToken()) * 14;
        int d = Integer.parseInt(st.nextToken()) * 6;
        System.out.println(a+b+c+d);
    }
}