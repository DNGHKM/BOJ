import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> al = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i <n; i++) {
            al.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(al);
        for(int i : al) {
            bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
    }
}