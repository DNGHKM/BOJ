import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        long result = 0;
        for (int i = 0; i <a.length(); i++) {
            for (int j = 0; j <b.length(); j++) {
                result += (long) (a.charAt(i) - '0') * (b.charAt(j) - '0');
            }
        }
        System.out.println(result);
    }
}