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
                result+=Long.parseLong(String.valueOf(a.charAt(i)))*Long.parseLong(String.valueOf(b.charAt(j)));
            }
        }
        System.out.println(result);
    }
}