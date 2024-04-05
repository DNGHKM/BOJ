import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            boolean flag = true;
            int n = Integer.parseInt(br.readLine());
            List<String> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(br.readLine());
            }
            Collections.sort(list);
            for (int j = 0; j < list.size()-1; j++) {
                if(list.get(j+1).startsWith(list.get(j))){
                    bw.write("NO\n");
                    flag=false;
                    break;
                }
            }
            if(flag) bw.write("YES\n");
        }
        bw.flush();
    }
}