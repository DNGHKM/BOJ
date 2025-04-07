import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a1 = Integer.parseInt(st.nextToken());
            int p1 = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int r1 = Integer.parseInt(st.nextToken());
            int p2 = Integer.parseInt(st.nextToken());

            if ((double) r1 * r1 * Math.PI / p2 < (double) a1 / p1) {
                bw.write("Slice of pizza\n");
                continue;
            }
            bw.write("Whole pizza\n");
        }
        bw.flush();
    }
}
