import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        int num = 1;
        for (int i = 0; i < n; i++) {
            int in = Integer.parseInt(br.readLine());
            for (int j = 0; j < in; j++) {
                list.add(num);
            }
            num++;
        }
        for (int i = 0; i < q; i++) {
            bw.write(list.get(Integer.parseInt(br.readLine())) + "\n");
        }
        bw.flush();
    }
}