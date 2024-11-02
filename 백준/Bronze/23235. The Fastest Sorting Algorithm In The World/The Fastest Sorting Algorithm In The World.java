import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i = 1;
        while (true) {
            if (br.readLine().equals("0")) {
                break;
            }
            bw.write("Case " + (i++) + ": Sorting... done!\n");
        }
        bw.flush();
    }
} 
